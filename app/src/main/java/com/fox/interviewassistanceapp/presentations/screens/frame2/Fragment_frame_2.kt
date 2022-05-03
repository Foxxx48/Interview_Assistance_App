package com.fox.interviewassistanceapp.presentations.screens.frame2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.databinding.FragmentFrame2Binding
import com.fox.interviewassistanceapp.utilits.APP_ACTIVITY


class Fragment_frame_2 : Fragment() {

    private var _binding: FragmentFrame2Binding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: FragmentFrame2ViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrame2Binding.inflate(layoutInflater,container,false)
        return mBinding.root

    }

    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this).get(FragmentFrame2ViewModel::class.java)
        mBinding.button2Frame2.setOnClickListener{
            APP_ACTIVITY.mNavController.navigate(R.id.action_fragment_frame_2_to_fragment_frame_3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.fox.interviewassistanceapp.presentations.screens.frame3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.databinding.FragmentFrame3Binding
import com.fox.interviewassistanceapp.utilits.APP_ACTIVITY


class Fragment_frame_3 : Fragment() {

    private var _binding: FragmentFrame3Binding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: FragmentFrame3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrame3Binding.inflate(layoutInflater,container,false)
        return mBinding.root
    }


    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this).get(FragmentFrame3ViewModel::class.java)
        mBinding.button2Frame3.setOnClickListener{
            APP_ACTIVITY.mNavController.navigate(R.id.action_fragment_frame_3_to_fragment_frame_3_2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
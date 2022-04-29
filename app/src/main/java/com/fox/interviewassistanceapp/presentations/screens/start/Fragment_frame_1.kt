package com.fox.interviewassistanceapp.presentations.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fox.interviewassistanceapp.databinding.FragmentFrame1Binding
import com.fox.interviewassistanceapp.utilits.TYPE_ROOM


class Fragment_frame_1 : Fragment() {
    private var _binding: FragmentFrame1Binding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: FragmentFrame1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrame1Binding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()

    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(FragmentFrame1ViewModel::class.java)
        mBinding.button1Frame1.setOnClickListener {
            mViewModel.initDatabase(TYPE_ROOM)
        }


    }
}
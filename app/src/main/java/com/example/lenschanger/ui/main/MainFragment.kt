package com.example.lenschanger.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lenschanger.R
import com.example.lenschanger.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        _binding!!.bottomLens.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_infLensFragment22)
        }
        _binding!!.bottomTuPutOn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_tuPutOnFragment22)
        }

        _binding!!.bottomOpenimg.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_infOpeningFragment22)
        }

        _binding!!.bottomSetting.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingFragment22)
        }

    }

}
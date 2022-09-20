package com.example.lenschanger.ui.fragment_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lenschanger.R
import com.example.lenschanger.databinding.FragmentInfLensBinding
import com.example.lenschanger.databinding.FragmentMainBinding

class InfLensFragment : Fragment() {
    private var _binding: FragmentInfLensBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfLensBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfLensBinding.bind(view)
        _binding!!.buttonInLensBack.setOnClickListener {
            findNavController().navigate(R.id.action_infLensFragment2_to_mainFragment)
        }
    }

}
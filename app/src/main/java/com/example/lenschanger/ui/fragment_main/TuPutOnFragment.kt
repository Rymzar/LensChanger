package com.example.lenschanger.ui.fragment_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lenschanger.R
import com.example.lenschanger.databinding.FragmentMainBinding
import com.example.lenschanger.databinding.FragmentTuPutOnBinding

class TuPutOnFragment : Fragment() {

    private var _binding: FragmentTuPutOnBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTuPutOnBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTuPutOnBinding.bind(view)
        _binding!!.buttonToPutOnBack.setOnClickListener {
            findNavController().navigate(R.id.action_tuPutOnFragment2_to_mainFragment)
        }
    }
}
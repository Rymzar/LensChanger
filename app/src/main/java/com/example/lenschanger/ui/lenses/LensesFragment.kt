package com.example.lenschanger.ui.lenses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lenschanger.R
import com.example.lenschanger.databinding.FragmentLensesBinding

class LensesFragment : Fragment() {

    private var _binding: FragmentLensesBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLensesBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}
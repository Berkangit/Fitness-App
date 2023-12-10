package com.app.ebfitapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.ebfitapp.R
import com.app.ebfitapp.databinding.FragmentBmiBinding

class BmiFragment : Fragment() {
   private lateinit var fragmentBmiBinding: FragmentBmiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentBmiBinding = FragmentBmiBinding.inflate(layoutInflater)
        return fragmentBmiBinding.root
    }


}
package com.app.ebfitapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.ebfitapp.R
import com.app.ebfitapp.databinding.FragmentExerciseOverviewBinding

class ExerciseOverviewFragment : Fragment() {


    private lateinit var exerciseOverviewBinding: FragmentExerciseOverviewBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        exerciseOverviewBinding = FragmentExerciseOverviewBinding.inflate(layoutInflater)



        return exerciseOverviewBinding.root
    }


}
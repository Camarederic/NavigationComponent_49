package com.example.navigationcomponent_49

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onStart() {
        super.onStart()

        button_second_next.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        button_second_back.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

}
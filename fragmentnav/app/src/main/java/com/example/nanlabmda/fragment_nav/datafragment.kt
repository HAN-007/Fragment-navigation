package com.example.nanlabmda.fragment_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class datafragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_datafragment, container, false)

        val buton2 = view.findViewById<Button>(R.id.button2)
        buton2.setOnClickListener {
            findNavController().navigate(R.id.action_datafragment_to_homefragment)
        }

        return view
    }
}
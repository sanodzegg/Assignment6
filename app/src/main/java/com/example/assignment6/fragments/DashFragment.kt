package com.sanodze.assignment6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sanodze.assignment6.R
import com.sanodze.assignment6.databinding.FragmentDashboardBinding

class DashFragment : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentDashboardBinding.bind(view)) {
            savedNumber.text = arguments?.getInt("amount").toString()
        }
    }
}
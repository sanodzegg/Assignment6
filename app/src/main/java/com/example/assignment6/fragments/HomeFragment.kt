package com.sanodze.assignment6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sanodze.assignment6.R
import com.sanodze.assignment6.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentHomeBinding.bind(view)) {
            save.setOnClickListener {
                if (number.text.isNotEmpty()) {
                    findNavController().navigate(
                        R.id.action_homeFragment_to_dashboardFragment, bundleOf(
                            "amount" to number.text.toString().toInt()
                        )
                    )
                } else
                    return@setOnClickListener
            }
        }
    }
}
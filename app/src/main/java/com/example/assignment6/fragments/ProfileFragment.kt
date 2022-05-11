package com.sanodze.assignment6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sanodze.assignment6.R
import com.sanodze.assignment6.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentProfileBinding.bind(view)) {
            clickToSignIn.setOnClickListener {
                findNavController().navigate(R.id.action_profileFragment_to_Register)
            }
        }
    }
}
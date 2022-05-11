package com.sanodze.assignment6

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sanodze.assignment6.databinding.FragmentSignInBinding


class SignIn : Fragment(R.layout.fragment_sign_in) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentSignInBinding.bind(view)) {
            signUp.setOnClickListener {
                findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToSignUpFragment())
            }
        }
    }
}
package com.sanodze.assignment6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sanodze.assignment6.R
import com.sanodze.assignment6.databinding.FragmentNotificationBinding

class NotifyFragment : Fragment(R.layout.fragment_notification) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(FragmentNotificationBinding.bind(view)) {
            argument.text = arguments?.getString("args")
        }
    }
}
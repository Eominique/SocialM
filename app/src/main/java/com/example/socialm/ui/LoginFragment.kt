package com.example.socialm.ui

import androidx.fragment.app.Fragment
import com.example.socialm.R
import com.example.socialm.ui.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment: Fragment(R.layout.fragment_login) {

private lateinit var viewModel: AuthViewModel
}
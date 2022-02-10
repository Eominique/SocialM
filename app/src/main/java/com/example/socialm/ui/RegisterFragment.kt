package com.example.socialm.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.socialm.R
import com.example.socialm.databinding.FragmentRegisterBinding
import com.example.socialm.ui.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment(R.layout.fragment_register) {

    lateinit var viewModel: AuthViewModel
    lateinit var binding: FragmentRegisterBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)
        subscribeToObservers()

        binding.tvLogin.setOnClickListener{

}
       binding.btnRegister.setOnClickListener {

       }

    }

    private fun subscribeToObservers() {

    }


}
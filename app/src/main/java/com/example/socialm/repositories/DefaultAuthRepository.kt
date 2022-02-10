package com.example.socialm.repositories

import com.example.socialm.other.Resource
import com.google.firebase.auth.AuthResult

class DefaultAuthRepository: AuthRepository {

    override fun register(username: String, email: String, password: String): Resource<AuthResult> {
        TODO("Not yet implemented")
    }

    override fun login(email: String, password: String): Resource<AuthResult> {
        TODO("Not yet implemented")
    }


}
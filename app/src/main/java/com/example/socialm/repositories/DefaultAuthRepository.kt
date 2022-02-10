package com.example.socialm.repositories

import com.example.socialm.other.Resource

class DefaultAuthRepository: AuthRepository {

    override fun register(username: String, email: String, password: String): Resource<*> {
        TODO("Not yet implemented")
    }

    override fun login(email: String, password: String): Resource<*> {
        TODO("Not yet implemented")
    }

}
package com.example.socialm.repositories

import com.example.socialm.other.Resource
import com.google.firebase.auth.AuthResult


interface AuthRepository {
fun register(username: String, email: String, password: String): Resource<AuthResult>
fun login(email: String, password: String): Resource<AuthResult>
}
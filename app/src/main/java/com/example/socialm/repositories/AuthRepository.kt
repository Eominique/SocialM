package com.example.socialm.repositories

import com.example.socialm.other.Resource


interface AuthRepository {
fun register(username: String, email: String, password: String): Resource<*>
fun login(email: String, password: String): Resource<*>
}
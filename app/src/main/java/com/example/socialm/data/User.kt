package com.example.socialm.data

import com.example.socialm.other.Constants.DEFAULT_PROFILE_PICTURE_URL

data class User(
    val uid: String = "",
    val username: String = "",
    val profilePictureUrl: String = DEFAULT_PROFILE_PICTURE_URL,
    val description: String = "",
    var follows: List<String> = listOf(),
    var isFollowing: Boolean = false
)
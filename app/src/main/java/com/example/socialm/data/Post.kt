package com.example.socialm.data

data class Post(
    val id: String = "",
    val authorUid: String = "",
    var authorUsername: String = "",
    var authorProfilePictureUrl: String = "",
    val text: String = "",
    val imageUrl: String = "",
    val date: Long = 0L,
    var isLiked: Boolean = false,
    var isLiking: Boolean = false,
    var likedBy: List<String> = listOf()
)
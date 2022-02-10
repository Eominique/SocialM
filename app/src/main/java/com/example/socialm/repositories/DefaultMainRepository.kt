package com.example.socialm.repositories

import android.net.Uri
import com.example.socialm.data.Post
import com.example.socialm.data.User
import com.example.socialm.other.Resource

class DefaultMainRepository: MainRepository {


    override suspend fun createPost(imageUri: Uri, text: String): Resource<Any> {
        TODO("Not yet implemented")
    }

    override suspend fun getUsers(uids: List<String>): Resource<List<User>> {
        TODO("Not yet implemented")
    }

    override suspend fun getUser(uid: String): Resource<User> {
        TODO("Not yet implemented")
    }

    override suspend fun getPostsForFollows(): Resource<List<Post>> {
        TODO("Not yet implemented")
    }

    override suspend fun toggleLikeForPost(post: Post): Resource<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun deletingPost(post: Post): Resource<Post> {
        TODO("Not yet implemented")
    }

    override suspend fun getPostsForProfile(uid: String): Resource<List<Post>> {
        TODO("Not yet implemented")
    }

    override suspend fun toggleFollowForUser(uid: String): Resource<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun searchUser(query: String): Resource<List<User>> {
        TODO("Not yet implemented")
    }

}
package com.example.socialm.di

import com.example.socialm.repositories.DefaultMainRepository
import com.example.socialm.repositories.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainModule {

    @Provides
    @ViewModelScoped
    fun provideMainRepository(): MainRepository =
       DefaultMainRepository()

}
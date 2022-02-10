package com.example.socialm.di

import com.example.socialm.repositories.AuthRepository
import com.example.socialm.repositories.DefaultAuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object AuthModule {

 @Provides
 @ViewModelScoped
 fun provideAuthRepository(): AuthRepository =
     DefaultAuthRepository()

}
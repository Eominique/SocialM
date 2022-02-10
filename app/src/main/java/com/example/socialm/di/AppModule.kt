package com.example.socialm.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


   @Singleton
   @Provides
   fun provideApplicationContext(
       context: Context
   ) = context



}
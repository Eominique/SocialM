package com.example.socialm.other

import androidx.lifecycle.Observer

class EventObserver<T>(
    private val onError: ((String) -> Unit)? = null,
    private val onLoading: (() -> Unit)? = null,
    private val onSuccess: (T) -> Unit
): Observer<Event<Resource<T>>>{
    override fun onChanged(t: Event<Resource<T>>?) {
        TODO("Not yet implemented")
    }


}
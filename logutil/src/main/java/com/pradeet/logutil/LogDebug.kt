package com.pradeet.logutil

import android.util.Log

class LogDebug {
    companion object {
        private const val TAG = "AndroidLogDebug"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}
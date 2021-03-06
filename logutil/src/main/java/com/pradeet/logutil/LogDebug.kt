package com.pradeet.logutil

import android.util.Log

class LogDebug {
    companion object {
        private const val TAG = "AndroidLogUtil"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}
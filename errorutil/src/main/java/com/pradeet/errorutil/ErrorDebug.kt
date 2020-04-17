package com.pradeet.errorutil

import android.util.Log

class ErrorDebug {
    companion object {
        private const val TAG = "AndroidLogUtil"

        fun e(message: String) {
            Log.e(TAG, message)
        }
    }
}
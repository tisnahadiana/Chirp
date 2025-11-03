package com.deeromptech.chat.data.network

import com.deeromptech.chat.domain.models.ConnectionState

expect class ConnectionErrorHandler {
    fun getConnectionStateForError(cause: Throwable): ConnectionState
    fun transformException(exception: Throwable): Throwable
    fun isRetriableError(cause: Throwable): Boolean
}
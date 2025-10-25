package com.deeromptech.chat.domain.chat

import com.deeromptech.chat.domain.models.Chat
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result
import kotlinx.coroutines.flow.Flow

interface ChatRepository {
    fun getChats(): Flow<List<Chat>>
    suspend fun fetchChats(): Result<List<Chat>, DataError.Remote>
}
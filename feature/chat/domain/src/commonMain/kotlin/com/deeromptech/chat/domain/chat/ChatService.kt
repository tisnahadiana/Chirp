package com.deeromptech.chat.domain.chat

import com.deeromptech.chat.domain.models.Chat
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result

interface ChatService {
    suspend fun createChat(
        otherUserIds: List<String>
    ): Result<Chat, DataError.Remote>

    suspend fun getChats(): Result<List<Chat>, DataError.Remote>
}
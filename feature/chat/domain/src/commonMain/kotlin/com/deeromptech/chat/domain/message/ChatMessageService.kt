package com.deeromptech.chat.domain.message

import com.deeromptech.chat.domain.models.ChatMessage
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result

interface ChatMessageService {
    suspend fun fetchMessages(
        chatId: String,
        before: String? = null
    ): Result<List<ChatMessage>, DataError.Remote>
}
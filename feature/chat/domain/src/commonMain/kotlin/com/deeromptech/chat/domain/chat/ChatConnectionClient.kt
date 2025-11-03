package com.deeromptech.chat.domain.chat

import com.deeromptech.chat.domain.error.ConnectionError
import com.deeromptech.chat.domain.models.ChatMessage
import com.deeromptech.chat.domain.models.ConnectionState
import com.deeromptech.core.domain.util.EmptyResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface ChatConnectionClient {
    val chatMessages: Flow<ChatMessage>
    val connectionState: StateFlow<ConnectionState>
    suspend fun sendChatMessage(message: ChatMessage): EmptyResult<ConnectionError>
}
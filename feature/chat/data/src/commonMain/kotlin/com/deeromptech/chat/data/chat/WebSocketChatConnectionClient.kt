package com.deeromptech.chat.data.chat

import com.deeromptech.chat.data.dto.websocket.WebSocketMessageDto
import com.deeromptech.chat.data.mappers.toNewMessage
import com.deeromptech.chat.data.network.KtorWebSocketConnector
import com.deeromptech.chat.database.ChirpChatDatabase
import com.deeromptech.chat.domain.chat.ChatConnectionClient
import com.deeromptech.chat.domain.chat.ChatRepository
import com.deeromptech.chat.domain.error.ConnectionError
import com.deeromptech.chat.domain.message.MessageRepository
import com.deeromptech.chat.domain.models.ChatMessage
import com.deeromptech.chat.domain.models.ChatMessageDeliveryStatus
import com.deeromptech.core.domain.auth.SessionStorage
import com.deeromptech.core.domain.util.EmptyResult
import com.deeromptech.core.domain.util.onFailure
import kotlinx.coroutines.flow.Flow
import kotlinx.serialization.json.Json

class WebSocketChatConnectionClient(
    private val webSocketConnector: KtorWebSocketConnector,
    private val chatRepository: ChatRepository,
    private val database: ChirpChatDatabase,
    private val sessionStorage: SessionStorage,
    private val json: Json,
    private val messageRepository: MessageRepository
): ChatConnectionClient {

    override val chatMessages: Flow<ChatMessage>
        get() = TODO("Not yet implemented")

    override val connectionState = webSocketConnector.connectionState

    override suspend fun sendChatMessage(message: ChatMessage): EmptyResult<ConnectionError> {
        val outgoingDto = message.toNewMessage()
        val webSocketMessage = WebSocketMessageDto(
            type = outgoingDto.type.name,
            payload = json.encodeToString(outgoingDto)
        )
        val rawJsonPayload = json.encodeToString(webSocketMessage)

        return webSocketConnector
            .sendMessage(rawJsonPayload)
            .onFailure { error ->
                messageRepository.updateMessageDeliveryStatus(
                    messageId = message.id,
                    status = ChatMessageDeliveryStatus.FAILED
                )
            }
    }
}
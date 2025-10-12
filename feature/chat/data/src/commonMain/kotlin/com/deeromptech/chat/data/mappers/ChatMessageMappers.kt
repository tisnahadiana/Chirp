package com.deeromptech.chat.data.mappers

import com.deeromptech.chat.data.dto.ChatMessageDto
import com.deeromptech.chat.domain.models.ChatMessage
import kotlin.time.Instant

fun ChatMessageDto.toDomain(): ChatMessage {
    return ChatMessage(
        id = id,
        chatId = chatId,
        content = content,
        createdAt = Instant.parse(createdAt),
        senderId = senderId
    )
}
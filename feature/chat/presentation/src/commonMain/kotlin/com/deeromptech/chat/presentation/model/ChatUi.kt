package com.deeromptech.chat.presentation.model

import com.deeromptech.chat.domain.models.ChatMessage
import com.deeromptech.core.designsystem.components.avatar.ChatParticipantUi

data class ChatUi(
    val id: String,
    val localParticipant: ChatParticipantUi,
    val otherParticipants: List<ChatParticipantUi>,
    val lastMessage: ChatMessage?,
    val lastMessageSenderUsername: String?
)
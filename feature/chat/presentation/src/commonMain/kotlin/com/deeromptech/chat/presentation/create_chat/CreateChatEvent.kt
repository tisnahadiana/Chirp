package com.deeromptech.chat.presentation.create_chat

import com.deeromptech.chat.domain.models.Chat

sealed interface CreateChatEvent {
    data class OnChatCreated(val chat: Chat): CreateChatEvent
}
package com.deeromptech.chat.presentation.chat_list

import com.deeromptech.chat.presentation.model.ChatUi
import com.deeromptech.core.designsystem.components.avatar.ChatParticipantUi
import com.deeromptech.core.presentation.util.UiText

data class ChatListState(
    val chats: List<ChatUi> = emptyList(),
    val error: UiText? = null,
    val localParticipant: ChatParticipantUi? = null,
    val isUserMenuOpen: Boolean = false,
    val showLogoutConfirmation: Boolean = false,
    val selectedChatId: String? = null,
    val isLoading: Boolean = false,
)

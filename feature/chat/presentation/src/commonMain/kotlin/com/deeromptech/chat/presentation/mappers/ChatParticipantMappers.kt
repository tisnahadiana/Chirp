package com.deeromptech.chat.presentation.mappers

import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.core.designsystem.components.avatar.ChatParticipantUi

fun ChatParticipant.toUi(): ChatParticipantUi {
    return ChatParticipantUi(
        id = userId,
        username = username,
        initials = initials,
        imageUrl = profilePictureUrl
    )
}
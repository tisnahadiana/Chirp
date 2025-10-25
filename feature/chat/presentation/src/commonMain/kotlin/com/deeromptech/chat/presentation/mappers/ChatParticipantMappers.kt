package com.deeromptech.chat.presentation.mappers

import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.core.designsystem.components.avatar.ChatParticipantUi
import com.deeromptech.core.domain.auth.User

fun ChatParticipant.toUi(): ChatParticipantUi {
    return ChatParticipantUi(
        id = userId,
        username = username,
        initials = initials,
        imageUrl = profilePictureUrl
    )
}

fun User.toUi(): ChatParticipantUi {
    return ChatParticipantUi(
        id = id,
        username = username,
        initials = username.take(2).uppercase(),
        imageUrl = profilePictureUrl
    )
}
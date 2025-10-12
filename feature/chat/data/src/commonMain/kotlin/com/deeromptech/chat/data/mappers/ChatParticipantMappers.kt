package com.deeromptech.chat.data.mappers

import com.deeromptech.chat.data.dto.ChatParticipantDto
import com.deeromptech.chat.domain.models.ChatParticipant

fun ChatParticipantDto.toDomain(): ChatParticipant {
    return ChatParticipant(
        userId = userId,
        username = username,
        profilePictureUrl = profilePictureUrl
    )
}
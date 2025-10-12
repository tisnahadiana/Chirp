package com.deeromptech.chat.domain.chat

import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result

interface ChatParticipantService {
    suspend fun searchParticipant(
        query: String
    ): Result<ChatParticipant, DataError.Remote>
}
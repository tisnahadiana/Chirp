package com.deeromptech.chat.domain.participant

import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result

interface ChatParticipantRepository {
    suspend fun fetchLocalParticipant(): Result<ChatParticipant, DataError>
}
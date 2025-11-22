package com.deeromptech.chat.data.participant

import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.chat.domain.participant.ChatParticipantRepository
import com.deeromptech.chat.domain.participant.ChatParticipantService
import com.deeromptech.core.domain.auth.SessionStorage
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result
import com.deeromptech.core.domain.util.onSuccess
import kotlinx.coroutines.flow.first

class OfflineFirstChatParticipantRepository(
    private val sessionStorage: SessionStorage,
    private val chatParticipantService: ChatParticipantService
): ChatParticipantRepository {

    override suspend fun fetchLocalParticipant(): Result<ChatParticipant, DataError> {
        return chatParticipantService
            .getLocalParticipant()
            .onSuccess { participant ->
                val currentAuthInfo = sessionStorage.observeAuthInfo().first()
                sessionStorage.set(
                    currentAuthInfo?.copy(
                        user = currentAuthInfo.user.copy(
                            id = participant.userId,
                            username = participant.username,
                            profilePictureUrl = participant.profilePictureUrl
                        )
                    )
                )
            }
    }
}
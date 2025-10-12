package com.deeromptech.chat.data.chat

import com.deeromptech.chat.data.dto.ChatParticipantDto
import com.deeromptech.chat.data.mappers.toDomain
import com.deeromptech.chat.domain.chat.ChatParticipantService
import com.deeromptech.chat.domain.models.ChatParticipant
import com.deeromptech.core.data.networking.get
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result
import com.deeromptech.core.domain.util.map
import io.ktor.client.HttpClient

class KtorChatParticipantService(
    private val httpClient: HttpClient
): ChatParticipantService {

    override suspend fun searchParticipant(query: String): Result<ChatParticipant, DataError.Remote> {
        return httpClient.get<ChatParticipantDto>(
            route = "/participants",
            queryParams = mapOf(
                "query" to query
            )
        ).map { it.toDomain() }
    }
}
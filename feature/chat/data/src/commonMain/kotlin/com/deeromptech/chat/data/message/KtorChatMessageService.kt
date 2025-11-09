package com.deeromptech.chat.data.message

import com.deeromptech.chat.data.dto.ChatMessageDto
import com.deeromptech.chat.data.mappers.toDomain
import com.deeromptech.chat.domain.message.ChatMessageService
import com.deeromptech.chat.domain.models.ChatMessage
import com.deeromptech.core.data.networking.get
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.Result
import com.deeromptech.core.domain.util.map
import io.ktor.client.HttpClient

class KtorChatMessageService(
    private val httpClient: HttpClient
): ChatMessageService {

    override suspend fun fetchMessages(
        chatId: String,
        before: String?
    ): Result<List<ChatMessage>, DataError.Remote> {
        return httpClient.get<List<ChatMessageDto>>(
            route = "/chat/$chatId/messages",
            queryParams = buildMap {
                this["pageSize"] = ChatMessageConstants.PAGE_SIZE
                if(before != null) {
                    this["before"] = before
                }
            }
        ).map { it.map { it.toDomain() } }
    }
}
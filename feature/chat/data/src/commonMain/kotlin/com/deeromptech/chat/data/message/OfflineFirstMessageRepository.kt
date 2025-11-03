package com.deeromptech.chat.data.message

import com.deeromptech.chat.database.ChirpChatDatabase
import com.deeromptech.chat.domain.message.MessageRepository
import com.deeromptech.chat.domain.models.ChatMessageDeliveryStatus
import com.deeromptech.core.data.database.safeDatabaseUpdate
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.EmptyResult
import kotlin.time.Clock

class OfflineFirstMessageRepository(
    private val database: ChirpChatDatabase
): MessageRepository {

    override suspend fun updateMessageDeliveryStatus(
        messageId: String,
        status: ChatMessageDeliveryStatus
    ): EmptyResult<DataError.Local> {
        return safeDatabaseUpdate {
            database.chatMessageDao.updateDeliveryStatus(
                messageId = messageId,
                status = status.name,
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        }
    }
}
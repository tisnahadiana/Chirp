package com.deeromptech.chat.domain.message

import com.deeromptech.chat.domain.models.ChatMessageDeliveryStatus
import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.EmptyResult

interface MessageRepository {
    suspend fun updateMessageDeliveryStatus(
        messageId: String,
        status: ChatMessageDeliveryStatus
    ): EmptyResult<DataError.Local>
}
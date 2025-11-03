package com.deeromptech.chat.domain.error

import com.deeromptech.core.domain.util.Error

enum class ConnectionError: Error {
    NOT_CONNECTED,
    MESSAGE_SEND_FAILED
}
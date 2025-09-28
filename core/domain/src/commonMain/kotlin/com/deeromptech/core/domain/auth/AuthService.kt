package com.deeromptech.core.domain.auth

import com.deeromptech.core.domain.util.DataError
import com.deeromptech.core.domain.util.EmptyResult

interface AuthService {
    suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote>

    suspend fun resendVerificationEmail(
        email: String
    ): EmptyResult<DataError.Remote>
}
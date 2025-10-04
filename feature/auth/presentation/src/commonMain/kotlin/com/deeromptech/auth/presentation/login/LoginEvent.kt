package com.deeromptech.auth.presentation.login

sealed interface LoginEvent {
    data object Success: LoginEvent
}
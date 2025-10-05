package com.deeromptech.chirp

sealed interface MainEvent {
    data object OnSessionExpired: MainEvent
}
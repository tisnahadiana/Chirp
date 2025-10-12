package com.deeromptech.chat.data.di

import com.deeromptech.chat.data.chat.KtorChatParticipantService
import com.deeromptech.chat.data.chat.KtorChatService
import com.deeromptech.chat.domain.chat.ChatParticipantService
import com.deeromptech.chat.domain.chat.ChatService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val chatDataModule = module {
    singleOf(::KtorChatParticipantService) bind ChatParticipantService::class
    singleOf(::KtorChatService) bind ChatService::class
}
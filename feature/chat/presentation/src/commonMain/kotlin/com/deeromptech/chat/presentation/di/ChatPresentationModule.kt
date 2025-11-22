package com.deeromptech.chat.presentation.di

import com.deeromptech.chat.presentation.chat_detail.ChatDetailViewModel
import com.deeromptech.chat.presentation.chat_list.ChatListViewModel
import com.deeromptech.chat.presentation.chat_list_detail.ChatListDetailViewModel
import com.deeromptech.chat.presentation.create_chat.CreateChatViewModel
import com.deeromptech.chat.presentation.manage_chat.ManageChatViewModel
import com.deeromptech.chat.presentation.profile.ProfileViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val chatPresentationModule = module {
    viewModelOf(::ChatListViewModel)
    viewModelOf(::ChatListDetailViewModel)
    viewModelOf(::CreateChatViewModel)
    viewModelOf(::ChatDetailViewModel)
    viewModelOf(::ManageChatViewModel)
    viewModelOf(::ProfileViewModel)
}
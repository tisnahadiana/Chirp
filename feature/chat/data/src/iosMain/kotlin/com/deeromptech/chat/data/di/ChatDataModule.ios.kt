package com.deeromptech.chat.data.di

import com.deeromptech.chat.database.DatabaseFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformChatDataModule = module {
    single { DatabaseFactory() }
}
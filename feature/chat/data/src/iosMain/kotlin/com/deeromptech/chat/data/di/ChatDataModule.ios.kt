package com.deeromptech.chat.data.di

import com.deeromptech.chat.data.lifecycle.AppLifecycleObserver
import com.deeromptech.chat.database.DatabaseFactory
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformChatDataModule = module {
    single { DatabaseFactory() }
    singleOf(::AppLifecycleObserver)
}
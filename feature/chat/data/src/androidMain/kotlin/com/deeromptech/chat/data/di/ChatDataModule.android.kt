package com.deeromptech.chat.data.di

import com.deeromptech.chat.data.lifecycle.AppLifecycleObserver
import com.deeromptech.chat.data.network.ConnectionErrorHandler
import com.deeromptech.chat.data.network.ConnectivityObserver
import com.deeromptech.chat.data.notification.FirebasePushNotificationService
import com.deeromptech.chat.database.DatabaseFactory
import com.deeromptech.chat.domain.notification.PushNotificationService
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val platformChatDataModule = module {
    single { DatabaseFactory(androidContext()) }
    singleOf(::AppLifecycleObserver)
    singleOf(::ConnectivityObserver)
    singleOf(::ConnectionErrorHandler)

    singleOf(::FirebasePushNotificationService) bind PushNotificationService::class
}
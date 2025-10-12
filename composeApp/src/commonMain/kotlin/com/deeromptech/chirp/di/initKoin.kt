package com.deeromptech.chirp.di

import com.deeromptech.auth.presentation.di.authPresentationModule
import com.deeromptech.chat.data.di.chatDataModule
import com.deeromptech.chat.presentation.di.chatPresentationModule
import com.deeromptech.core.data.di.coreDataModule
import com.deeromptech.core.presentation.di.corePresentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            coreDataModule,
            authPresentationModule,
            appModule,
            chatPresentationModule,
            corePresentationModule,
            chatDataModule
        )
    }
}
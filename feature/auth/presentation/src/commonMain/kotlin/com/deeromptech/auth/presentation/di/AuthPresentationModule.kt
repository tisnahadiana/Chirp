package com.deeromptech.auth.presentation.di

import com.deeromptech.auth.presentation.register.RegisterViewModel
import com.deeromptech.auth.presentation.register_success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
}
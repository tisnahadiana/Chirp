package com.deeromptech.auth.presentation.di

import com.deeromptech.auth.presentation.email_verification.EmailVerificationViewModel
import com.deeromptech.auth.presentation.forgot_password.ForgotPasswordViewModel
import com.deeromptech.auth.presentation.login.LoginViewModel
import com.deeromptech.auth.presentation.register.RegisterViewModel
import com.deeromptech.auth.presentation.register_success.RegisterSuccessViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authPresentationModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::RegisterSuccessViewModel)
    viewModelOf(::EmailVerificationViewModel)
    viewModelOf(::LoginViewModel)
    viewModelOf(::ForgotPasswordViewModel)
}
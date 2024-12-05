package com.clean.code.features.auth.di

import com.clean.code.features.auth.credentials.Authenticator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authModule = module {
    singleOf(::Authenticator)
}

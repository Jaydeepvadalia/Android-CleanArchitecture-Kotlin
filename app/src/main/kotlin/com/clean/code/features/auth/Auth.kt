package com.clean.code.features.auth

import com.clean.code.core.Feature
import com.clean.code.features.auth.credentials.Authenticator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

fun authFeature() = object : Feature {

    override fun name() = "auth"

    override fun diModule() = module {
        singleOf(::Authenticator)
    }
}

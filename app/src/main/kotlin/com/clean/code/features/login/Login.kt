package com.clean.code.features.login

import com.clean.code.core.Feature
import org.koin.dsl.module

fun loginFeature() = object : Feature {

    override fun name() = "login"

    override fun diModule() = module {}
}

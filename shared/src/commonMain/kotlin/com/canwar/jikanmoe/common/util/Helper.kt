package com.canwar.jikanmoe.common.util

import com.canwar.jikanmoe.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(getSharedModules())
    }
}
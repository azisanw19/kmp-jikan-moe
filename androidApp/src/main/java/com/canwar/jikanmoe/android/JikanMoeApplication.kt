package com.canwar.jikanmoe.android

import android.app.Application
import com.canwar.jikanmoe.android.di.appModule
import com.canwar.jikanmoe.di.getSharedModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JikanMoeApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        /**
         * Inject Koin
         * */
        startKoin {
            androidContext(this@JikanMoeApplication)
            modules(appModule + getSharedModules())
        }
    }

}
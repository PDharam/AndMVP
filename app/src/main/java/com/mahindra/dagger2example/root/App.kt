package com.mahindra.dagger2example.root

import android.app.Application
import com.mahindra.dagger2example.login.LoginModule

/**
 * Created by AND707 on 29-May-18.
 */
class App : Application() {
    private lateinit var appComponant: AppComponant

    override fun onCreate() {
        super.onCreate()
        appComponant = DaggerAppComponant.builder()
                .appModule(AppModule(this))
                //.loginModule(LoginModule())
                .build()
    }

    public fun getComponant(): AppComponant {
        return appComponant
    }
}
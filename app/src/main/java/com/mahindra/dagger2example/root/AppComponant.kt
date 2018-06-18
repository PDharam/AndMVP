package com.mahindra.dagger2example.root

import com.mahindra.dagger2example.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by AND707 on 29-May-18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponant {
    fun inject(mainActivity: LoginActivity)
}
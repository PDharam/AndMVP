package com.mahindra.dagger2example

import android.app.Application

/**
 * Created by AND707 on 29-May-18.
 */
class App :Application(){
    private lateinit var appComponant:AppComponant

    override fun onCreate() {
        super.onCreate()
        //appComponant=DaggerAppC.builder().appModule(AppModule(this)).build()
    }
}
package com.mahindra.dagger2example.root

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by AND707 on 29-May-18.
 */
@Module
class AppModule {
    var app: Application

    constructor(app: Application) {
        this.app = app
    }

    @Provides
    @Singleton
    fun providContext(): Context {
        return app
    }
}
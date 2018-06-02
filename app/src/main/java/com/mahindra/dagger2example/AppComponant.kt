package com.mahindra.dagger2example

import dagger.Component
import javax.inject.Singleton

/**
 * Created by AND707 on 29-May-18.
 */
@Singleton
@Component
interface AppComponant {
     fun inject(mainActivity: MainActivity)
}
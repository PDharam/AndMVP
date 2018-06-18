package com.mahindra.dagger2example.login

/**
 * Created by AND707 on 18-Jun-18.
 */
interface LoginRepository {
    fun getUser(): User

    fun saveUser()
}
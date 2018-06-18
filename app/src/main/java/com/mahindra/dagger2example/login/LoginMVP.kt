package com.mahindra.dagger2example.login

/**
 * Created by AND707 on 18-Jun-18.
 */
interface LoginMVP {
    interface View {
        fun getFirstName(): String
        fun getLastName(): String

        fun showUserNotAvailable()
        fun showInputError()
        fun showUserSaveMsg()

        fun setFirstName(firstname: String)
        fun setLastName(lastname: String)
    }

    interface Presenter {
        fun setView(view: LoginMVP.View)
        fun loginBtnClicked()
        fun getCurrentUser()
    }

    interface Module {
        fun createUser(firstname: String, lastname: String)
        fun getUser(): User
    }

}
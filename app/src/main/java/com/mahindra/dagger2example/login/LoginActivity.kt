package com.mahindra.dagger2example.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mahindra.dagger2example.R
import com.mahindra.dagger2example.root.App
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginMVP.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        (application as App).getComponant().inject(this)
        btn_login.setOnClickListener({

        })
    }


    override fun getFirstName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLastName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUserNotAvailable() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showInputError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUserSaveMsg() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFirstName(firstname: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLastName(lastname: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

package com.example.signup_form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login_form : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var btn1:Button
    lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
        views()
        btn1.setOnClickListener {
            if(email.text.isEmpty()){
                email.setError("Fill in all fields")
            }
            if(pass.text.isEmpty()){
                pass.setError("Fill in all fields")
            }else{
                var intent=Intent(baseContext,Hello::class.java)
                startActivity(intent)
            }
        }
        btn2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
    fun views(){
        email=findViewById(R.id.etEmail2)
        pass=findViewById(R.id.etPassword)
        btn1=findViewById(R.id.btnLog)
        btn2=findViewById(R.id.btn2sign)
    }

}
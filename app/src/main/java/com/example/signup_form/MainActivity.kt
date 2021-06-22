package com.example.signup_form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var gender:Spinner
    lateinit var email:EditText
    lateinit var phone:EditText
    lateinit var pass:EditText
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         castViews()
        spin()
        button.setOnClickListener {
            if(name.text.isEmpty()){
                name.setError("Fill in all fields")
            }
            if(email.text.isEmpty()){
                email.setError("Fill in all fields")
            }
            if(phone.text.isEmpty()){
                phone.setError("Fill in all fields")
            }
            if(pass.text.isEmpty()){
                pass.setError("Fill in all fields")
            }else {
                val intent = Intent(baseContext, login_form::class.java)
                startActivity(intent)
            }
        }


    }
    fun castViews(){
        name=findViewById(R.id.etName)
        gender=findViewById(R.id.spGender)
        email=findViewById(R.id.etEmail2)
        phone=findViewById(R.id.etPhone)
        pass=findViewById(R.id.etPass)
        button=findViewById(R.id.btnSign)
    }
    fun spin(){
        val genders= arrayOf("Female","Male","Binary","They/Them","Other")
        val adapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item, genders)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.adapter=adapter

    }
}
package com.example.applaut

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignInActivity : AppCompatActivity() {
    private  lateinit var  email: EditText
    private  lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
       email =findViewById(R.id.email)
        password =findViewById(R.id.password)
        }
    fun singIn(view: View){
        val emailText=email.text.toString()
        val passwordText=password.text.toString()
        if (emailText.isNotEmpty()&& passwordText.isNotEmpty()){
            val intent =Intent(this@SignInActivity,MenuActivity::class.java)
            intent.putExtra("key","@emailText")
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "У вас есть не заполненые поля", Toast.LENGTH_SHORT).show()
        }
    }
}
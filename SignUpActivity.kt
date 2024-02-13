package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast



import android.widget.ArrayAdapter
import android.widget.Spinner


import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_layout)

        val loginView = findViewById<TextView>(R.id.LoginView)

        loginView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val signupButton = findViewById<Button>(R.id.signup_btn2)

        signupButton.setOnClickListener {
            val intent = Intent(this, VerifyActivity::class.java)
            startActivity(intent)
        }



        //Spinners
        val countrySpinner: Spinner = findViewById(R.id.countryMenu)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val countries =   arrayOf("Select Country", "Country 1", "Country 3") // Add your actual country names
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.prompt = "Select Country"
        countrySpinner.adapter = adapter



        val citySpinner: Spinner = findViewById(R.id.cityMenu)


        val cities = arrayOf("Select City", "City 1", "City 3") // Add your actual country names
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)


        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        citySpinner.prompt = "Select City"


        citySpinner.adapter = adapter2
}
}
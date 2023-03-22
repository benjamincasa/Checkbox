package com.example.checkbox

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var txt:EditText
    lateinit var txtCursiva:CheckBox
    lateinit var txtNegrita:CheckBox
   lateinit var txtconbinado:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.ednombre)


    }
    fun clickCheck(view: View){
        txt.typeface = Typeface.DEFAULT
        val checkPresionando: CheckBox = view  as CheckBox

        if(checkPresionando.id == R.id.txtCursiva && checkPresionando.isChecked){
            txt.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)}

       if (checkPresionando.id == R.id.txtconbinado && checkPresionando.isChecked)
           txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)


       else if(checkPresionando.id == R.id.txtNegritas && checkPresionando.isChecked)
            txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD)}


        }




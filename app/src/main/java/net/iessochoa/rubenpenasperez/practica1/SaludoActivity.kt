package net.iessochoa.rubenpenasperez.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var tvSaludo: TextView
    companion object{
        //Clave que permite recibir un texto que mostrará en pantalla
        val EXTRA_NOMBRE="pactica1.SaludoActivity.nombre"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //asignamos la instancia de tvSaludo en onCreate
        tvSaludo= this.findViewById(R.id.tvSaludo)
        //recuperamos el valor enviado por MainActivity
        val nombre=intent.getStringExtra(EXTRA_NOMBRE)
        //mostramos el valor
        tvSaludo.text=String.format(getString(R.string.saludo),nombre)
    }
}
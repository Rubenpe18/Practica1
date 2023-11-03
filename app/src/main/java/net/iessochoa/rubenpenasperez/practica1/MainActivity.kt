package net.iessochoa.rubenpenasperez.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre:EditText
    private lateinit var btAceptar:Button

    fun enviarSaludo(){
        //comprobamos si el campo está vacío
        if (!etNombre.text.isEmpty()){
            //Creamos el Intent hacia SaludoActivity
            val intent = Intent(this,SaludoActivity::class.java)
            //le pasamos el contenido etNombre como clave::valor(parecido a un map)
            intent.putExtra(SaludoActivity.EXTRA_NOMBRE, etNombre.text.toString())
            //iniciamos la activity SaludoActivity
            startActivity(intent)
        }else
            //enviamos un mensaje por pantalla
            Toast.makeText(this, "Es necesario introducir el nombre",Toast.LENGTH_LONG).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //buscamos los views
        etNombre=findViewById(R.id.etNombre)
        btAceptar=findViewById(R.id.btAceptar)

        //asignamos acción como lambda
        btAceptar.setOnClickListener{enviarSaludo()}



    }
}
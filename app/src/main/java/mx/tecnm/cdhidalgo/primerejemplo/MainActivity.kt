package mx.tecnm.cdhidalgo.primerejemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //var es para declarar variables mutables
    //val para declarar variable inmutables (constantes)
    //? la variable puede ser nula
    //!! indicarle al compilador que no compruebe si la variable es nula
    var etUsuario: EditText? = null
    var etPassword: EditText? = null
    var bInicio: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsuario = findViewById(R.id.etUsuario)
        etPassword = findViewById(R.id.etPassword)
        bInicio = findViewById(R.id.bInicio)

        bInicio!!.setOnClickListener { login() }
    }

    private fun login() {
        //Toast.makeText(this,"El usuario es:" + (etUsuario?.text :? "X"),Toast.LENGTH_LONG).show()
        if(etUsuario!!.text.toString() == "admin" && etPassword!!.text.toString() == "123"){
            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)
            return
        }
        Toast.makeText(this,"ERROR DE INICIO",Toast.LENGTH_LONG).show()
    }

}
package topete.salazar.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tercera.*

class TerceraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)
        btnback2.setOnClickListener {
            val miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)
        }

        val mensaje = intent.getStringExtra("info")

        if (mensaje.isNotEmpty()){
            textView3.text = mensaje
        }else{
            textView3.text = "no envio nada"
        }

    }
}

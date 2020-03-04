package topete.salazar.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        segunda.setOnClickListener {
            //intent para abrir otra activity
            val miIntent = Intent(this, SegundaActivity::class.java)
            startActivity(miIntent)
        }
        tercera.setOnClickListener {
            val miIntent = Intent(this,TerceraActivity::class.java)
            startActivity(miIntent)
        }


    }
}

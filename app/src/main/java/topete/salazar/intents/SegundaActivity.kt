package topete.salazar.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        btnback.setOnClickListener {
            val miSegundoIntent = Intent(this,TerceraActivity::class.java)

            val nombre = editText.text.toString()
            miSegundoIntent.putExtra("info",nombre)
            startActivity(miSegundoIntent)
        }
    }
}

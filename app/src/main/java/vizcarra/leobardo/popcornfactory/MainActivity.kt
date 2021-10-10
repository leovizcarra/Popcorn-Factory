package vizcarra.leobardo.popcornfactory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.GridView
import kotlinx.android.synthetic.main.pelicula.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonP: Button = findViewById(R.id.botonP)

        botonP.setOnClickListener(){
            var intent: Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }

    }

}
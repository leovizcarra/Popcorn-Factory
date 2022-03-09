package vizcarra.leobardo.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class detalle_pelicula : AppCompatActivity() {

    val iv_pelicula_imagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
    val tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
    val tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras
        var ns = 0
        var id = -1
        var title = ""

        if (bundle != null){

            var ns = bundle.getInt("numberSeats")

            title = bundle.getString("titulo")!!
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
            seatsLeft.setText("$ns seats available ")
            id = bundle.getInt("pos")
        }

        if (ns==0){
            buy_tickets.isEnabled = false
        } else {
            buy_tickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)

                intent.putExtra("id", id)
                intent.putExtra("name", title)
            }
        }

    }
}
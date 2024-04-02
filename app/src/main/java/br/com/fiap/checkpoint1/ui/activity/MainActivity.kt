package br.com.fiap.checkpoint1.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Carro
import br.com.fiap.checkpoint1.ui.recycleview.adapter.ListaCarrosAdapter
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaCarrosAdapter(
            context = this,
            carros = listOf(
                Carro("Courrier","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp"),
                Carro("Golf Sapão","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp")
            )
        )

    }
}
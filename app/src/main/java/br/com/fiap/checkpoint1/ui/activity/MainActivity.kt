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

        // Binding: processo de vinculação do código fonte com o arquivo de layout.
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Carro horrível, caçamba e step de fácil remoção"
//
//        val marca = findViewById<TextView>(R.id.descricao)
//        marca.text = "Ford"
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "R$9,90"
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaCarrosAdapter(
            context = this,
            carros = listOf(
                Carro("Courrier","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp"),
                Carro("Golf Sapão","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp")
            )
        )

//        val recyclerView = findViewById< RecyclerView>(R.id.recyclerView)
//        recyclerView.adapter = ListaCarrosAdapter(this)
    }
}
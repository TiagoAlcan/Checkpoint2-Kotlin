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

/**
 * Classe principal que representa a atividade principal da aplicação.
 * Esta atividade exibe uma lista de carros em um RecyclerView (componente de interface - listas ou grades grandes e dinâmicas).
 */
class MainActivity : ComponentActivity() { //Herança - subclasse
    /**
     * Método chamado quando a atividade está sendo criada.
     * @param savedInstanceState: Um objeto Bundle contendo o estado anterior da atividade, se disponível.
     */
    @SuppressLint("MissingInflatedId") // Indica ao compilador ignorar/suprimir o aviso (geralmente gerado no método findViewById) relacionado a um ID de layout ausente
    override fun onCreate(savedInstanceState: Bundle?) { // Polimorfismo - armazenar e recuperar informações importantes sobre o estado da sua atividade, garantindo que as informações sejam mantidas durante mudanças no ciclo de vida da atividade (chave e valor).
        super.onCreate(savedInstanceState) // Garante que o comporatmento da classe pai seja executado durante a criação da atividade
        setContentView(R.layout.activity_main) // Define o layout da atividade como activity_main.xml

        // Encontra o RecyclerView na hierarquia de views e atribui a variável recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Cria uma instância de ListaCarrosAdapter e configura o RecyclerView com essa instância através do adapter (fornece dados e cria a View)
        recyclerView.adapter = ListaCarrosAdapter(
            context = this, // Contexto da atividade (referencia o contexto atual da aplicação)
            carros = listOf( // Criando a lista de carros
                Carro("Courrier","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp"),
                Carro("Golf Sapão","Carro horrível, caçamba e step de fácil remoção","Ford", BigDecimal.valueOf(9.90), "/assets/images/courrier.webp")
            )
        )

    }
}
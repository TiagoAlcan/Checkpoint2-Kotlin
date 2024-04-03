package br.com.fiap.checkpoint1.ui.recycleview.adapter // Define o pacote onde a classe está localizada

// Importações de bibliotecas e classes necessárias
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Carro

// Define a classe ListaCarrosAdapter que herda de RecyclerView.Adapter
class ListaCarrosAdapter(
    private val context: Context, // Contexto para inflar o layout
    private val carros: List<Carro> // Lista de carros a serem exibidos
) : RecyclerView.Adapter<ListaCarrosAdapter.ViewHolder>() {

    // Define a classe interna ViewHolder para gerenciar a exibição de cada item
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // Método para vincular os dados de um carro ao layout do item
        fun vincula(carro: Carro) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = carro.nome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = carro.descricao

            val marca = itemView.findViewById<TextView>(R.id.marca)
            marca.text = carro.marca

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = carro.valor.toPlainString()

            val imageUrl = itemView.findViewById<TextView>(R.id.imageUrl)
            imageUrl.text = carro.imageUrl
        }
    }

    // Método para criar um ViewHolder e inflar o layout do item
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaCarrosAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.carro_item, parent, false)
        return ListaCarrosAdapter.ViewHolder(view)
    }

    // Método para retornar a quantidade de itens na lista
    override fun getItemCount(): Int = carros.size

    // Método para vincular os dados de um carro ao ViewHolder na posição especificada
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carro = carros[position]
        holder.vincula(carro)
    }
}

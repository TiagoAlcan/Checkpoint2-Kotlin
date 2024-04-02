package br.com.fiap.checkpoint1.ui.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.checkpoint1.R
import br.com.fiap.checkpoint1.model.Carro

class ListaCarrosAdapter(
    private val context: Context,
    private val carros: List<Carro>
) : RecyclerView.Adapter<ListaCarrosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

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

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaCarrosAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.carro_item, parent, false)
        return ListaCarrosAdapter.ViewHolder(view)
    }


    override fun getItemCount(): Int = carros.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carro = carros[position]
        holder.vincula(carro)
    }

}
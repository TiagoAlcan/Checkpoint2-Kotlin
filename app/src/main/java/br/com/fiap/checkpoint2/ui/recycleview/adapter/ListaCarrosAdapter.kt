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
) : RecyclerView.Adapter<ListaCarrosAdapter.ViewHolder>() { // A função principal do ViewHolder é manter referências às views dentro de cada item da lista.
    // Sem um ViewHolder, o sistema precisaria inflar o layout do item da lista e buscar as referências para as views (usando findViewById)
    // toda vez que um novo item precisasse ser exibido. Isso pode ser custoso em termos de desempenho, especialmente em listas longas.
    // O ViewHolder armazena essas referências uma vez quando o layout é inflado pela primeira vez e as mantém em cache.
    // Quando um item precisa ser atualizado, o ViewHolder já tem as referências às views prontas, o que é muito mais eficiente.


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
        // Este é o ViewGroup (classe no Android que serve como contêiner para organizar e conter outras views, permitindo a criação de interfaces de usuário complexas e flexíveis.)
        // no qual o ViewHolder recém-criado será inserido após ser associado a uma visão. No contexto de um RecyclerView, parent é o RecyclerView em si.
        viewType: Int
        // Este parâmetro é útil quando você tem diferentes tipos de itens em sua lista, por exemplo, se a lista exibir diferentes layouts para diferentes tipos de dados.
        // Neste caso, você pode usar o viewType para identificar qual layout deve ser inflado. Se sua lista tem apenas um tipo de item, este parâmetro geralmente é ignorado.
    ): ListaCarrosAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        // é uma classe em Android usada para inflar layouts XML em objetos de view. Aqui, estamos obtendo uma instância de LayoutInflater a partir do contexto do aplicativo.
        val view = inflater.inflate(R.layout.carro_item, parent, false)
        // 'resource: Int' ID do recurso do layout XML, 'root: ViewGroup?' especifica o ViewGroup que será o pai das views infladas,
        // 'attachToRoot: Boolean' Este parâmetro é um booleano que indica se as views infladas devem ser anexadas ao ViewGroup especificado pelo parâmetro root.
        // Se attachToRoot for true, as views infladas serão automaticamente adicionadas ao ViewGroup especificado por root. Se attachToRoot for false, as views infladas não serão automaticamente adicionadas;
        // você precisará fazer isso manualmente.

        // Este é o passo em que inflamos o layout de item que será utilizado para representar um item na lista. Estamos inflando o layout carro_item.xml
        // dentro do ViewGroup parent (que é o RecyclerView) e configurando attachToRoot como false.
        // Isso significa que não estamos anexando a visão inflada ao ViewGroup especificado, porque o RecyclerView cuidará disso para nós.
        return ListaCarrosAdapter.ViewHolder(view)
    }

    // Método para retornar a quantidade de itens na lista
    override fun getItemCount(): Int = carros.size

    // É responsável por atualizar as views dentro do ViewHolder com os dados correspondentes à posição atual na lista de dados.
    // Isso permite que o RecyclerView exiba corretamente os dados em cada item da lista conforme eles são rolados na tela.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val carro = carros[position]
        holder.vincula(carro)
    }
}

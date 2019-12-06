package br.edu.ifsp.scl.dpm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    companion object {
        var itens: List<Item> = listOf()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_celula, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindItems(itens[position])
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item: Item) {
            val imagem = itemView.findViewById(R.id.imageView) as ImageView
            val nome = itemView.findViewById(R.id.nome) as TextView
            val descricao = itemView.findViewById(R.id.descricao) as TextView

            imagem.setImageResource(item.imagem)
            nome.text = item.nome
            descricao.text = item.descricao

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "${item.nome}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
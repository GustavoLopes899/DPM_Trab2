package br.edu.ifsp.scl.dpm

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsp.scl.dpm.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this

        var lista: List<Item> = listOf(
            Item("Argentina", "Segundo maior país da América do Sul em território e o terceiro em população ", R.drawable.argentina),
            Item("Bolívia", "País que inclui diversos relevos, como a Cordilheira dos Andes e o deserto do Atacama", R.drawable.bolivia),
            Item("Brasil", "Maior país em extensão da América do Sul.", R.drawable.brazil),
            Item("Canáda", "Segundo maior país do mundo em extensão, localizado ao norte da América do norte.", R.drawable.canada),
            Item("Chile", "País com território incomum, com 6300km de comprimento com média de 175km de largura.", R.drawable.chile),
            Item("Colômbia", "Localizado no extremo norte da América do Sul, marcado por florestas tropicais e plantações de café.", R.drawable.colombia),
            Item("Equador", "País que é dividido pela linha do Equador, pertencendo ao dois hemisférios do globo terrestre.", R.drawable.ecuador),
            Item("Estados Unidos", "País com 50 estados, que se extende ao norte do continente com a porção do Alasca.", R.drawable.usa),
            Item("Paraguai", "País sulamericando que não possui saída para o mar, com muitas regiões de Chaco.", R.drawable.paraguay),
            Item("México", "Situado na América Central conhecido pela cultura e ruínas antigas de seus povos originários da região.", R.drawable.mexico),
            Item("Perú", "O Perú é conhecido pela sua cultura antiga, principalmente em relação aos povos Incas.", R.drawable.peru),
            Item("Uruguai", "País conhecido por sua extensa faixa litoral e por sua tradição em churrascarias.", R.drawable.uruguay),
            Item("Venezuela", "País com muitas atrações turísticas, destacando suas ilhas paradísiacas.", R.drawable.venezuela)
        )

        // Inicializa recycler view com os dados
        Adapter.itens = lista
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        adapter = Adapter()
        recyclerView.adapter = adapter

    }
}

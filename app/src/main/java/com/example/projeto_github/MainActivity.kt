package com.example.projeto_github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateList(20)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateList(size: Int):List<ExampleItem>{

        // size = qtos items eu quero ter na lista

        val list = ArrayList<ExampleItem>()

        for(i in 0 until size){
            val drawable = when (i % 3){
                0 -> R.drawable.ic_imagem
                1 -> R.drawable.ic_broken
                else -> R.drawable.ic_imagens
            }

            val item = ExampleItem(drawable,"Item $i", "Descricao repositorio lorem ipsum dolore voluptatem sit amet lorem ipsum","User",
                "Nome Completo", drawable, drawable, "0000","0000")
            list += item
        }
        return list
    }



}
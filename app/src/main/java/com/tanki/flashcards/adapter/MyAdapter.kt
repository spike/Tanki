package com.tanki.flashcards.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tanki.flashcards.R
import com.tanki.flashcards.model.Deck

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder> () {
    private var myList = emptyList<Deck>()


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val idView: TextView = itemView.findViewById(R.id.id_text)
        val contentView: TextView = itemView.findViewById(R.id.content)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.deck_list_content, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = myList[position]
       // holder.idView.text = item.deckId.toString()
        holder.contentView.text = item.topic

        with(holder.itemView) {
            tag = item
          //  setOnClickListener(onClickListener)
        }
    }

    fun setData(newList: List<Deck>) {
        myList = newList
        notifyDataSetChanged()

    }
}
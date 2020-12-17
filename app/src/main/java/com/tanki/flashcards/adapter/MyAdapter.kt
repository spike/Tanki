package com.tanki.flashcards.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.tanki.flashcards.FlashCardActivity
import com.tanki.flashcards.R
import com.tanki.flashcards.model.Deck

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder> () {
    private var myList = emptyList<Deck>()

    inner class MyViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {
        val cardTotalView: TextView = itemView.findViewById(R.id.card_total)
        val contentView: TextView = itemView.findViewById(R.id.content)

        init {
            itemView.setOnClickListener { v: View ->
                val intent = Intent(context, FlashCardActivity::class.java)
                var bundle = Bundle()
                intent.putExtra("topic", contentView.text)
                context.startActivity(intent)
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.deck_list_content, parent, false)
        return MyViewHolder(view, parent.context)
    }

    override fun getItemCount(): Int {
        return myList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = myList[position]
        holder.contentView.text = item.topic
        holder.cardTotalView.text = item.size.toString()

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
package com.luiztadeu.guiafinancas.presentation.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luiztadeu.guiafinancas.R
import com.luiztadeu.guiafinancas.domain.Transaction
import com.luiztadeu.guiafinancas.extension.formataDateCalender
import kotlinx.android.synthetic.main.transacao_item.view.*

class TransactionListAdapter(transacoes : List<Transaction>) : RecyclerView.Adapter<TransactionListAdapter.ViewHolder>() {

    private val transacoes = transacoes

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.transacao_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return transacoes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val transaction = transacoes[position]

        holder.itemView.transacao_valor.text = transaction.valor.toString()
        holder.itemView.transacao_categoria.text = transaction.categoria
        holder.itemView.transacao_data.text = transaction.data.formataDateCalender()
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
}

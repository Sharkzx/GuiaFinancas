package com.luiztadeu.guiafinancas.presentation.adapter

import android.database.DataSetObserver

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luiztadeu.guiafinancas.R
import com.luiztadeu.guiafinancas.domain.Transaction
import kotlinx.android.synthetic.main.transacao_item.view.*

class TransactionListAdapter(transacoes : List<Transaction>) : RecyclerView.Adapter<TransactionListAdapter.ViewHolder>() {

    private val transacoes = transacoes

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transacao_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
}
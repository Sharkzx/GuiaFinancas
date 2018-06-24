package com.luiztadeu.guiafinancas.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.luiztadeu.guiafinancas.R
import com.luiztadeu.guiafinancas.domain.Transaction
import com.luiztadeu.guiafinancas.presentation.adapter.TransactionListAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class TransactionListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
                Transaction(BigDecimal("20.14"), "Economia", Calendar.getInstance()),
                Transaction(BigDecimal("23.15"), "Comida", Calendar.getInstance()))

        val adapter = TransactionListAdapter(transacoes)

        lista_transacoes_recycleview.layoutManager = LinearLayoutManager(this)
        lista_transacoes_recycleview.setHasFixedSize(true)
        lista_transacoes_recycleview.adapter = adapter

    }
}
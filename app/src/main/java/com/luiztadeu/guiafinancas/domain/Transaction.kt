package com.luiztadeu.guiafinancas.domain

import java.math.BigDecimal
import java.util.*

class Transaction (private val valor: BigDecimal,
                   private val categoria: String,
                   private val data: Calendar){
}

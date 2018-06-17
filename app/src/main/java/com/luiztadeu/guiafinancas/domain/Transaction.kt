package com.luiztadeu.guiafinancas.domain

import java.math.BigDecimal
import java.util.*

class Transaction (val valor: BigDecimal,
                   val categoria: String,
                   val data: Calendar)

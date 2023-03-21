package br.senai.sp.jandira.lazy.model

import androidx.compose.ui.graphics.painter.Painter

data class Product(
    var id: Int = 0,
    var name: String = "",
    var description: String = "Esta e a descrição do produto",
    var price: Double = 0.0,
    var image: Painter? = null
)

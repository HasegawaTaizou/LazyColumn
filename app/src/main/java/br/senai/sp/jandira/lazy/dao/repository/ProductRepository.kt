package br.senai.sp.jandira.lazy.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazy.R
import br.senai.sp.jandira.lazy.model.Product

class ProductRepository {
    companion object {

        @Composable
        fun getProductsList(): List<Product> {
            return listOf<Product>(
                Product(id = 1, name = "Feijó", description = "Teste alo"),
                Product(id = 2, name = "Teclado", image = painterResource(id = R.drawable.caio)),
                Product(id = 3, name = "Monitor", price = 897.99),
                Product(id = 4, name = "Impressora"),
            )
        }
    }
}
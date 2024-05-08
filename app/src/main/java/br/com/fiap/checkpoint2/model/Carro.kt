package br.com.fiap.checkpoint1.model

import java.math.BigDecimal

/**
 * Representa um objeto Carro que possui informações como nome, descrição, marca, valor e URL da imagem.
 * @property nome: O nome do carro.
 * @property descricao: A descrição do carro.
 * @property marca: A marca do carro.
 * @property valor: O valor do carro em BigDecimal.
 * @property imageUrl: A URL da imagem do carro.
 */
class Carro (
    val nome: String,
    val descricao: String,
    val marca: String,
    val valor: BigDecimal,
    val imageUrl: String
)
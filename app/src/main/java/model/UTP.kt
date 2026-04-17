package model

import androidx.annotation.DrawableRes

data class UTP(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)

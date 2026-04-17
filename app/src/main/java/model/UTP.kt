package model

import androidx.annotation.DrawableRes

data class UTP(
    val nama: String,
    val deskripsi: String,
    @DrawableRes val imageRes: Int
)

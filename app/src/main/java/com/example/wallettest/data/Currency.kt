package com.example.wallettest.data

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Jaehyeon on 1/19/24.
 */
data class Currency(
    val name: String,
    val buy: Float,
    val sell: Float,
    val icon: ImageVector,
)
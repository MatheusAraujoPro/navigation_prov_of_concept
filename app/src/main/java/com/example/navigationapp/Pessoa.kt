package com.example.navigationapp

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class Pessoa(
    val fullName: String,
    val age: Int,
): Parcelable

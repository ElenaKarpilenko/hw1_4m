package com.example.hw1_4m.ui.model

import java.io.Serializable

data class User(
    val name : String,
    val email : String,
    val password: Int
):Serializable

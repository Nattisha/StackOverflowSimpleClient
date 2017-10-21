package com.example.yoba.stackoverflowsimpleclient

data class Question(val title: String,
                    val ownerName: String,
                    val body: String = "no body",
                    val link: String = "/some/link/to/nowhere",
                    val isAnswered: Boolean = false,
                    val score: Int = 0)

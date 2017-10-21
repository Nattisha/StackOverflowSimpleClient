package com.example.yoba.stackoverflowsimpleclient

interface QuestionsPresenter {

    fun setView(view: QuestionsView)

    fun displayQuestions()

    fun destroy()

}
package com.example.yoba.stackoverflowsimpleclient

interface QuestionsView {

    fun showQuestions(questions: List<Question>);

    fun showLoading();

    fun hideLoading();

}
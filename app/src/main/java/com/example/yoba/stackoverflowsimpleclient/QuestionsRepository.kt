package com.example.yoba.stackoverflowsimpleclient

import io.reactivex.Observable

interface QuestionsRepository {

    fun loadQuestionsList(): Observable<List<Question>>
}

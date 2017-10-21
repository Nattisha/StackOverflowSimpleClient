package com.example.yoba.stackoverflowsimpleclient

import io.reactivex.Observable

class QuestionsRepositoryImpl : QuestionsRepository {

    override fun loadQuestionsList(): Observable<List<Question>> {
        return fakeList()
    }

    private fun fakeList(): Observable<List<Question>> {
        val questionsList: ArrayList<Question> = ArrayList();
        questionsList.add(Question(title = "Dummy question 1", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 2", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 3", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 4", isAnswered = true, ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 5", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 6", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 7", isAnswered = true, ownerName = "John Doe"))
        return Observable.just(questionsList)
    }
}
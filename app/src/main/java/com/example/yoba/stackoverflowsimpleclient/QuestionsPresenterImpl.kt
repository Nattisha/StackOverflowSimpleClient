package com.example.yoba.stackoverflowsimpleclient

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class QuestionsPresenterImpl : QuestionsPresenter {

    private lateinit var view: QuestionsView
    private lateinit var questionsRepository: QuestionsRepository

    override fun setView(view: QuestionsView) {
        this.view = view
        this.questionsRepository = QuestionsRepositoryImpl()
        displayQuestions()
    }

    override fun displayQuestions() {
        view.showLoading()
        questionsRepository.loadQuestionsList().
                subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe({
                    view.hideLoading()
                    view.showQuestions(it)
                }, {
                    view.hideLoading()
                })
    }

    override fun destroy() {

    }
}

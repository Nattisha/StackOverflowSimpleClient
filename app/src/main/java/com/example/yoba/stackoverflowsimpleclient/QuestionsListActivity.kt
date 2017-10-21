package com.example.yoba.stackoverflowsimpleclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.questions_list.*

class QuestionsListActivity : AppCompatActivity(), QuestionsView{

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showQuestions(questions: List<Question>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var questionsList: ArrayList<Question>
    private lateinit var adapter: QuestionsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions_list)
        fillDataList()
        initAdapter()
    }

    private fun initAdapter() {
        adapter = QuestionsAdapter(questionsList)
        questions_list.adapter = adapter
    }

    private fun fillDataList() {
        questionsList = ArrayList();
        questionsList.add(Question(title = "Dummy question 1", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 2", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 3", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 4", isAnswered = true, ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 5", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 6", ownerName = "John Doe"))
        questionsList.add(Question(title = "Dummy question 7", isAnswered = true, ownerName = "John Doe"))
    }
}

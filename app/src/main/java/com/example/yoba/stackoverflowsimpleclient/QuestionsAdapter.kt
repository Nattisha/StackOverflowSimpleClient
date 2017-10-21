package com.example.yoba.stackoverflowsimpleclient

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.question_list_item.view.*

internal class QuestionsAdapter constructor(private val dataList: List<Question>) :
        RecyclerView.Adapter<QuestionsAdapter.QuestionViewHolder>() {

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val question: Question = dataList[position]
        holder.titleTv.text = question.title
        holder.authorTv.text = question.ownerName
        holder.scoreTv.text = question.score.toString()
        holder.isAnsweredIv.visibility = if (question.isAnswered) View.VISIBLE else View.GONE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.question_list_item, parent, false)
        return QuestionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.count()
    }

    internal inner class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var authorTv: TextView = itemView.author_tv
        var titleTv: TextView = itemView.title_tv
        var scoreTv: TextView = itemView.score_tv
        var isAnsweredIv: ImageView = itemView.is_answered_iv
    }
}
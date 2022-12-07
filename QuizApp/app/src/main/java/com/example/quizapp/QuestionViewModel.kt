package com.example.quizapp

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.quizapp.setData.score

class QuestionViewModel: ViewModel() {

//    val Name: String?
//        get() = _Name

    public var score:Int=0
//    val score: Int
//        get() = _score

    public var currentPosition:Int=1
//    val _currentPosition: Int
//        get() = currentPosition


//    val _questionList: ArrayList<QuestionData>?
//        get() = questionList

    public var _selecedOption:Int=0
//    val selectedOption: Int
//        get() = _selecedOption

    init {
        Log.d("QuestionActivity", "QuestionViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.d("QuestionActivity", "QuestionViewModel destroyed!")
    }


}
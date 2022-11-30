package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView

class questions : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
////            param1 = it.getString(ARG_PARAM1)
////            param2 = it.getString(ARG_PARAM2)
////
//
//        }
//    }
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_result)
    window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
    val userName=intent.getStringExtra(setData.name)
    val score=intent.getStringExtra(setData.score)
    val totalQuestion=intent.getStringExtra("total size")

    congo.text="Congratulations ${userName} !!"
    Score.text="${score} / ${totalQuestion}"
    button.setOnClickListener {
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }

}


}
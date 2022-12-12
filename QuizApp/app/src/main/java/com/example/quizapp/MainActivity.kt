package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        button.setOnClickListener {
            val username = input.text.toString()
            val score = intent.getStringExtra(setData.score)
            if(username.isEmpty())
            {
                Toast.makeText(this,"Enter Your Name",Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,Question::class.java)
                intent.putExtra("${setData.name}",input.text.toString())
                startActivity(intent)
                finish()
            }
//            database = FirebaseDatabase.getInstance().getReference("Players")
//            val Player = Player(username, score)
//            database.child(username).setValue(Player).addOnSuccessListener {
//                Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
//
//            }.addOnFailureListener{
//                Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show()
//            }
        }



    }
}



package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent

import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val username=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")
        val total = "${score} / ${totalQuestion}"
        congo.text="Congratulations ${username} !!"
        Score.text="${score} / ${totalQuestion}"

        database = FirebaseDatabase.getInstance().getReference("Players")
        val Player = Player(username, total)
        database.child(username.toString()).setValue(Player).addOnSuccessListener {
            Toast.makeText(this,"Saved", Toast.LENGTH_LONG).show()

        }.addOnFailureListener{
            Toast.makeText(this,"Failed", Toast.LENGTH_LONG).show()
        }
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}
package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var linearLayout: LinearLayout
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }


//        @Suppress("UNUSED_VARIABLE")
//        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        linearLayout = binding.lol
//        val navController = this.findNavController(R.id.lol)
//        NavigationUI.setupActionBarWithNavController(this,navController, linearLayout)
//        NavigationUI.setupWithNavController(binding.fragmentContainerView, navController)
//
//    }
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.fragmentContainerView)
//        return NavigationUI.navigateUp(navController, linearLayout)
//    }



}



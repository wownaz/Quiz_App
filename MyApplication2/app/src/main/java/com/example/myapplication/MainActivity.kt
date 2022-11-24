package com.example.myapplication

import android.os.Bundle
import android.provider.ContactsContract
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.dashboard.DashboardFragment
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.ui.notifications.NotificationsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())
        binding.navView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.navigation_day -> replaceFragment(HomeFragment())
                R.id.navigation_week -> replaceFragment(DashboardFragment())
                R.id.navigation_month -> replaceFragment(NotificationsFragment())
                else ->{
                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.linear_layout,fragment)
        fragmentTransaction.commit()

    }
}
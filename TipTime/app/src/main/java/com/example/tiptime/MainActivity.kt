package com.example.tiptime

import java.text.NumberFormat
import com.example.tiptime.R

import com.example.tiptime.databinding.ActivityMainBinding



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{ calculateTip() }
    }
    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost==null){
            binding.tipResult.text = ""
            return
        }
        val tipPercentage = when(binding.tipOptions.checkedRadioButtonId){
            R.id.option_twenty_percent->0.2
            R.id.option_eighteen_percent->0.18
            else->0.15
        }
        var tip = tipPercentage*cost
        if(binding.roundUpSwitch.isChecked){
            tip = kotlin.math.ceil(tip)
        }
        NumberFormat.getCurrencyInstance()

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }


    }


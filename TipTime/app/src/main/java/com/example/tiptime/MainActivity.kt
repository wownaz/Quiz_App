import com.example.tiptime.R

import com.example.tiptime.databinding.ActivityMainBinding



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when(selectedId){
            R.id.option_twenty_percent->0.2
            R.id.option_eighteen_percent->0.18
            else->0.15
        }
    }
}

package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalculate.setOnClickListener {
           val getPremium:Double = getPremium()
            textView5.text = getPremium.toString()
        }

        btnReset.setOnClickListener {
            spinner.setSelection(0)
            radioGroup.clearCheck()
            checkBox.setChecked(false)
            textView5.text = ""
        }

///yyryrytry5


    }
    fun getPremium():Double{

        return when(spinner.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00+
                    (if(radMale.isChecked) 50.00 else 0.0) +
                    (if(ralFemale.isChecked) 50.00 else 0.0) +
                    (if(checkBox.isChecked) 100.00 else 0.0)

            2 -> 90.00+
                    (if(radMale.isChecked) 100.00 else 0.0) +
                    (if(ralFemale.isChecked) 100.00 else 0.0) +
                    (if(checkBox.isChecked) 150.00 else 0.0)

            3 -> 120.00+
                    (if(radMale.isChecked) 150.00 else 0.0) +
                    (if(ralFemale.isChecked) 150.00 else 0.0) +
                    (if(checkBox.isChecked) 200.00 else 0.0)

            4 -> 150.00+
                    (if(radMale.isChecked) 200.00 else 0.0) +
                    (if(ralFemale.isChecked) 200.00 else 0.0) +
                    (if(checkBox.isChecked) 250.00 else 0.0)

            else -> 150.00+
                    (if(radMale.isChecked) 200.00 else 0.0) +
                    (if(ralFemale.isChecked) 200.00 else 0.0) +
                    (if(checkBox.isChecked) 300.00 else 0.0)
        }
    }
}

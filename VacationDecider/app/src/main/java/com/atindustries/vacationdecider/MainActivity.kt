package com.atindustries.vacationdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val vacationList = arrayListOf("Orlando", "Savannah", "Sedona", "New York")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cycleButton.setOnClickListener {
            val random = Random()
            val randomVacationSpot = random.nextInt(vacationList.count())

            vacationSpot.text = vacationList[randomVacationSpot]
        }

        addVacationSpotButton.setOnClickListener {
            val newVacationSpot = addVacationSpotInput.text.toString()
            vacationList.add(newVacationSpot)
            addVacationSpotInput.text.clear()
        }

    }
}

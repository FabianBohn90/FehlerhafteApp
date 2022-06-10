package com.syntax_institut.fehlerhafteapp

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Countdownvariablen
    private lateinit var countDownTimer: CountDownTimer
    private var countNr: Int = 6

    /**
     * Die Lifecycle onCreate Methode
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countdown()
    }

    /**
     * Die Countdown Methode
     */
    private fun countdown() {
        countDownTimer = object : CountDownTimer(5000, 1000) {
            override fun onTick(p0: Long) {
                countNr--
                findViewById<TextView>(R.id.textView).text = countNr.toString()
            }

            override fun onFinish() {
                findViewById<TextView>(R.id.textView).visibility = View.GONE
                findViewById<TextView>(R.id.secondtextView).visibility = View.GONE
                findViewById<TextView>(R.id.thirdtextView).visibility = View.VISIBLE
            }
        }.start()
    }
}

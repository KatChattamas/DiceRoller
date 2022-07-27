package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)



        rollButton.setOnClickListener() {


            //displayText.text = "INK"
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val diceImage: ImageView = findViewById(R.id.imageView)
            when (diceRoll) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }
            if (diceRoll == 4){
                    val toast = Toast.makeText(this, "You win", Toast.LENGTH_SHORT)
                    toast.show()
                }
            else {
                val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
                toast.show()
             }
            }
        }


    class Dice(var numsides: Int) {
        fun roll(): Int {
            return (1..numsides).random()
        }
    }
}


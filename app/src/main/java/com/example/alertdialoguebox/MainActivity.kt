package com.example.alertdialoguebox

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alertdialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                //What action should be perform when yes is clicked?
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                //What action should be perform when No is clicked?
            })
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("Doremon", "Schinchan", "Ninja Hatori",  "Tom and jerry")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite cartoon?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                //What action should be perform when user clicks on my option
                Toast.makeText(this,"You clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                //What action should be perform when yes is clicked?
                finish()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->
                //What action should be perform when No is clicked?
            })
            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("Doremon", "Schinchan", "Ninja Hatori",  "Tom and jerry")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Select your favourite cartoons")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                //What action should be perform when user clicks on my option
                Toast.makeText(this,"You select on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->
                builder3.show()
            })

        }
        }


    }

package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val languages = arrayListOf("Uzbek", "English", "French", "Deutsch", "Russian")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        binding.spinner.adapter = adapter

//        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?, view: View?, position: Int, id: Long
//            ) {
//                Toast.makeText(this@MainActivity, languages[position], Toast.LENGTH_SHORT - 1000)
//                    .show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//
//            }

//        binding.selected.setOnClickListener {
//            val lang=languages[binding.spinner.selectedItemPosition]
//            Toast.makeText(this,lang,Toast.LENGTH_SHORT-1000).show()
//        }

        binding.autoComplete.setAdapter(adapter)
        }
    }
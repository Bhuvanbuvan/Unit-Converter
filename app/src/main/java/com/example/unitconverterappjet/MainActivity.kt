package com.example.unitconverterappjet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.unitconverterappjet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: MainAcivityViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel= ViewModelProvider(this)[MainAcivityViewModel::class.java]
        viewModel.Pound.observe(
            this
        ) {
            binding.output.text = "$it Pounds"
        }

        binding.button.setOnClickListener {
            viewModel.covert(binding.editText.text.toString())
        }
    }
}
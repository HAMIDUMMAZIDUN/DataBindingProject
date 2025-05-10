package com.unikom.databindingproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.unikom.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.txtDataBinding.text = "Ini text yaxng dibungkus menggunakan binding"

        binding.button2.setOnClickListener {
            binding.txtDataBinding.text = "Ini adalah text yang diubah"
        }
    }
}

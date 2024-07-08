package com.akirachix.enwalletapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwalletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvwallet.layoutManager = LinearLayoutManager(this)
        displayWallet()


    }
    fun displayWallet(){
        val wallet1 = Enwallet("","Salary","KES 30000","1st july 2024")
        val wallet2 = Enwallet("","Rent","KES 35000","2st july 2024")
        val wallet3 = Enwallet("","Dividends","KES 40000","3st july 2024")
        val wallet4 = Enwallet("","Electricity","KES 30000","4st july 2024")
        val wallet5 = Enwallet("","Internet","KES 100000","5st july 2024")
        val wallet6 = Enwallet("","Shopping","KES 60000","6st july 2024")
        val wallet7 = Enwallet("","Bus Fare","KES 20000","7st july 2024")
        val wallet8 = Enwallet("","Water bull","KES 40000","8st july 2024")
        val enwallet = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8)
        val enwalletAdaptor = EnwalletAdaptor(enwallet)
        binding.rvwallet.adapter = enwalletAdaptor
    }
}
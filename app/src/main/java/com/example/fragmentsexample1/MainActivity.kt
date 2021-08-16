package com.example.fragmentsexample1

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample1.databinding.*

class MainActivity: AppCompatActivity(), Communicator {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragment,firstFragment)
            commit()
        }
    }

    override fun passDataCom(bundle: Bundle, fragNum: String) {



        when(fragNum) {
            "second" -> {
                val secondFragment = SecondFragment()
                val fourthFragment = FourthFragment()
                val thirdFragment = ThirdFragment()
                fourthFragment.arguments = bundle
                secondFragment.arguments = bundle
                thirdFragment.arguments = bundle
                supportFragmentManager.beginTransaction().replace(R.id.flFragment, secondFragment)
                    .commit()
            }
            "third" -> {
                val thirdFragment = ThirdFragment()
                supportFragmentManager.beginTransaction().replace(R.id.flFragment,thirdFragment)
                    .commit()
            }
            "fourth" -> {
                val fourthFragment = FourthFragment()
                supportFragmentManager.beginTransaction().replace(R.id.flFragment,fourthFragment)
                    .commit()
            }

        }
    }

}



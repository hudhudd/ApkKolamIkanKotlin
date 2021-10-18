package com.example.capskolwmanualnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.capskolwmanualnav.fragment.AkunFragment
import com.example.capskolwmanualnav.fragment.HomeFragment
import com.example.capskolwmanualnav.fragment.RiwayatFragment

class MainActivity : AppCompatActivity() {

    val fragmentHome: Fragment = HomeFragment()
    val fragmentRiwayat: Fragment = RiwayatFragment()
    val fragmentAkun: Fragment = AkunFragment()
    val fm: FragmentManager = supportFragmentManager
    var active: Fragment = fragmentHome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.canvas, fragmentHome).show(fragmentHome).commit()
    }
}
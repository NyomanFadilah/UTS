package com.nyoman.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nyoman.uts.fragment.AccountFragment
import com.nyoman.uts.fragment.BookmarkFragment
import com.nyoman.uts.fragment.HomeFragment
import com.nyoman.uts.fragment.ListBuildFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homefragment = HomeFragment()
        val listkomikFragment = ListBuildFragment()
        val bookmarkFragment = BookmarkFragment()
        val accountFragment = AccountFragment ()

        makeCurrentFragment (homefragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> makeCurrentFragment(homefragment)
                R.id.menu_daftarkomik -> makeCurrentFragment(listkomikFragment)
                R.id.menu_bookmark -> makeCurrentFragment(bookmarkFragment)
                R.id.menu_account -> makeCurrentFragment(accountFragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }

    }
}
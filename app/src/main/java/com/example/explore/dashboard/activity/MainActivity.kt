package com.example.explore.dashboard.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.explore.dashboard.fragments.HomeFragment
import com.example.explore.R
import com.example.explore.dashboard.adapter.ExploreDashboardAdapter
import com.example.explore.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity  : AppCompatActivity()  {

    private lateinit var binding:ActivityMainBinding;

    private lateinit var adapter1: ExploreDashboardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = HomeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        adapter1 =  ExploreDashboardAdapter();
        binding.rvDashboardMain.layoutManager = LinearLayoutManager(this);
        binding.rvDashboardMain.adapter = adapter1;
       /* val bottomNavigationView = binding.rvBottomNavigation;
        val menu = bottomNavigationView.getMenu();
        val menuItem = menu.findItem(R.id.save);
        menuItem.setIcon(R.drawable.ic_char);*/
        setUp()
    }

    private fun setUp(){

        binding.rvBottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit()
                    true
                }
                R.id.notification->{

                    true
                }
                R.id.save -> {
                    // Handle Search item selection
                    true
                }
                R.id.profile -> {
                    // Handle Profile item selection
                    true
                }
                else -> false
            }
        }
        /*
        binding.rvBottomNavigation.layoutManager = GridLayoutManager(this,5)
        binding.rvBottomNavigation.adapter = CustomBottomNavAdapter(this)*/
    }

}
package com.raitapiasf.userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    private lateinit var pagerAdapter: PageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()
        pagerAdapter = PageAdapter(supportFragmentManager)
        viewPager.adapter=pagerAdapter
        viewPager.offscreenPageLimit = 2
    }

    //funcion que añade la barra
    private fun initToolbar() {
        setSupportActionBar(toolbar)
    }

    //Funcion para que aparezca el menu en la barra
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return true
    }

    //funcion para crear acciones al seleccionar algo del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.option_one ->
            {showToast("Opcion 1")
                return true}
            R.id.option_two ->
            {showToast("Opcion 2")
                return true}
            R.id.option_three ->
            {showToast("Opcion 3")
                return true}
            R.id.option_four ->
            {showToast("Opcion 4")
                return true}
            R.id.option_five ->
            {showToast("Opcion 5")
                return true}
            else ->
                super.onOptionsItemSelected(item)
        }
        return true
    }

    //
    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
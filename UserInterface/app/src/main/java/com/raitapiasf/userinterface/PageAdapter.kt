package com.raitapiasf.userinterface

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class PageAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {

    //Esta función devuelve una instancia a la clase ExampleFragment
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return ExampleFragment.newInstance("Ejemplo1", R.color.red)
            1 -> return ExampleFragment.newInstance("Ejemplo2", R.color.blue)
            2 -> return ExampleFragment.newInstance("Ejemplo3", R.color.green)
        }
        return ExampleFragment.newInstance("ejemploX", R.color.black)
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return null
    }
}
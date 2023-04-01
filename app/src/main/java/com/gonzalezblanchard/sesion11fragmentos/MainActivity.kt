package com.gonzalezblanchard.sesion11fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gonzalezblanchard.sesion11fragmentos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnFragmentActionListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "El Botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }

    fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentcontainer, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun cargarFragmentoRojo(view: View) {
        loadFragment(RedFragment())
    }

    fun cargarFragmentoAzul(view:View) {
        loadFragment(BlueFragment())
    }
}
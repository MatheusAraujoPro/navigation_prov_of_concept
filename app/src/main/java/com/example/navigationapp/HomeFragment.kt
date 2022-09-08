package com.example.navigationapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var navControler: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.buttonNavegarXml.setOnClickListener(this)
        binding.buttonNavegarCompose.setOnClickListener(this)
        binding.buttonNavegarFragmentTeste.setOnClickListener(this)
        navControler = findNavController()

        return binding.root
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_navegar_xml) {
            val user = Pessoa(fullName = "Matheus de Araújo", age = 25)

            val action = HomeFragmentDirections.actionHomeFragmentToFinanceFragment(user)
            navControler.navigate(action)
        } else if (v.id == R.id.button_navegar_compose) {

            val action = HomeFragmentDirections.actionHomeFragmentToScreanFragmentComposeTest()
            v.findNavController().navigate(action)

        } else if (v.id == R.id.button_navegar_fragment_teste) {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment()
            v.findNavController().navigate(action)

        }
    }
}


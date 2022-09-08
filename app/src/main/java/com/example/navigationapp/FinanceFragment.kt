package com.example.navigationapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationapp.databinding.FragmentFinanceBinding


class FinanceFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentFinanceBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFinanceBinding.inflate(inflater, container, false)

        val bundle = arguments
        val args = FinanceFragmentArgs.fromBundle(bundle!!)

        binding.textUserName.text = args.user.fullName
        binding.textUserAge.text = args.user.age.toString()

        return binding.root
    }
}
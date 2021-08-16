package com.example.fragmentsexample1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample1.databinding.FragmentFirstBinding
import com.example.fragmentsexample1.databinding.FragmentSecondBinding
import com.example.fragmentsexample1.utils.FIRST_NAME_EXTRA
import com.example.fragmentsexample1.utils.LAST_NAME_EXTRA


/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var communicator: Communicator
    private lateinit var binding: FragmentFirstBinding


        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        communicator = activity as Communicator

        binding.btnFragment1.setOnClickListener() {
                val bundle = Bundle()
                bundle.putString(FIRST_NAME_EXTRA,binding.firstName.text.toString())
                bundle.putString(LAST_NAME_EXTRA,binding.lastName.text.toString())

                communicator.passDataCom(bundle, "second")
            }
            return binding.root

        }

 }







/*override fun onCreateView(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val button = binding.btnFragment1
*/













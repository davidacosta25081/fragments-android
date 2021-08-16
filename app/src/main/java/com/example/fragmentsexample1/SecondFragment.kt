package com.example.fragmentsexample1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample1.databinding.FragmentSecondBinding
import com.example.fragmentsexample1.utils.EMAIL_EXTRA
import com.example.fragmentsexample1.utils.FIRST_NAME_EXTRA


/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var communicator: Communicator
    var displayMessage: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        communicator = activity as Communicator
        displayMessage = arguments?.getString(FIRST_NAME_EXTRA)
        binding.testing.text = displayMessage


        binding.btnFragment2.setOnClickListener(){
            val bundle = Bundle()
            bundle.putString(EMAIL_EXTRA,binding.email.text?.toString())
            communicator.passDataCom(bundle, "third")



        }
        return binding.root
    }
}


package com.example.fragmentsexample1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample1.databinding.FragmentFirstBinding
import com.example.fragmentsexample1.databinding.FragmentThirdBinding
import com.example.fragmentsexample1.utils.EMAIL_EXTRA
import com.example.fragmentsexample1.utils.FIRST_NAME_EXTRA
import com.example.fragmentsexample1.utils.LAST_NAME_EXTRA


class ThirdFragment : Fragment() {


    private lateinit var binding: FragmentThirdBinding
    private lateinit var communicator: Communicator


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdBinding.inflate(inflater,container,false)
        communicator = activity as Communicator

        binding.btnFragment3.setOnClickListener(){
            val bundle = Bundle()
            communicator.passDataCom(bundle,"fourth")

        }
        return binding.root
    }








}
package com.example.fragmentsexample1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample1.databinding.FragmentFourthBinding
import com.example.fragmentsexample1.utils.EMAIL_EXTRA
import com.example.fragmentsexample1.utils.FIRST_NAME_EXTRA
import com.example.fragmentsexample1.utils.LAST_NAME_EXTRA


class FourthFragment : Fragment() {
    private lateinit var binding: FragmentFourthBinding
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(inflater, container, false)
        communicator = activity as Communicator
        binding.tvName.text = arguments?.getString(FIRST_NAME_EXTRA)
        binding.tvLastname.text = arguments?.getString(LAST_NAME_EXTRA)
        binding.tvEmail.text = arguments?.getString(EMAIL_EXTRA)


        return binding.root

    }

    //override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      //  super.onViewCreated(view, savedInstanceState)
        //binding.let{  binding ->

}

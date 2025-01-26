package com.rocky.androidnavigationsvetofor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.rocky.androidnavigationsvetofor.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.redBTN.setOnClickListener {
//            view.findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
            val name = binding.redBTN.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToRedFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.redBTN to "red"
            )
            findNavController().navigate(action, extras)
        }

        binding.yellowBTN.setOnClickListener {
            val name = binding.yellowBTN.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToYellowFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.yellowBTN to "yellow"
            )
            findNavController().navigate(action, extras)
        }

        binding.greenBTN.setOnClickListener {
            val name = binding.greenBTN.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToGreenFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.greenBTN to "green"
            )
            findNavController().navigate(action, extras)
        }
    }
}
package com.rocky.androidnavigationsvetofor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
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
        binding.button.setOnClickListener {
//            view.findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
            val name = binding.editTextET.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToTwoFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.editTextET to "editText"
            )
            findNavController().navigate(action, extras)
        }
    }


}
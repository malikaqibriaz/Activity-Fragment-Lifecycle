package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class FragmentLifecycle : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAGGG", "Fragment onAttach, Called...")
        Toast.makeText(requireContext(), "onAttach, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAGGG", "Fragment onCreate, Called...")
        Toast.makeText(requireContext(), "onCreate, Called...", Toast.LENGTH_SHORT).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_lifecycle, container, false)
        Log.d("TAGGG", "Fragment onCreateView, Called...")
        Toast.makeText(requireContext(), "onCreateView, Called...", Toast.LENGTH_SHORT).show()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAGGG", "Fragment onViewCreated, Called...")
        Toast.makeText(requireContext(), "onViewCreated, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAGGG", "Fragment onStart, Called...")
        Toast.makeText(requireContext(), "onStart, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGGG", "Fragment onResume, Called...")
        Toast.makeText(requireContext(), "onResume, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGGG", "Fragment Fragment onPause, Called...")
        Toast.makeText(requireContext(), "onPause, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGGG", "Fragment onStop, Called...")
        Toast.makeText(requireContext(), "onStop, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAGGG", "Fragment onDestroyView, Called...")
        Toast.makeText(requireContext(), "onDestroyView, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGGG", "Fragment onDestroy, Called...")
        Toast.makeText(requireContext(), "onDestroy, Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TAGGG", "Fragment onDetach, Called...")
        Toast.makeText(requireContext(), "onDetach, Called...", Toast.LENGTH_SHORT).show()
    }
}
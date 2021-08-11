package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding
import java.util.zip.Inflater

class TitleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding:FragmentTitleBinding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_titleFragment3_to_gameFragment2);
        }
        return binding.root
    }
}
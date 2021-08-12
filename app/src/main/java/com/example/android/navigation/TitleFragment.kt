package com.example.android.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())||super.onOptionsItemSelected(item)
    }
}
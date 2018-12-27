package io.github.jimmysharp.navigationsample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.jimmysharp.navigationsample.R
import kotlinx.android.synthetic.main.main_fragment.view.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)

        view.main_next1_button.setOnClickListener {
            findNavController().navigate(R.id.action_main_go_next1)
        }
        view.main_next2_button.setOnClickListener {
            findNavController().navigate(R.id.action_main_go_next2)
        }
        view.main_layered_button.setOnClickListener {
            findNavController().navigate(R.id.action_main_go_layered)
        }
        view.main_login_button.setOnClickListener {
            findNavController().navigate(R.id.action_main_go_login)
        }

        return view
    }
}

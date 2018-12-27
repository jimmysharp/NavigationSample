package io.github.jimmysharp.navigationsample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.jimmysharp.navigationsample.R
import kotlinx.android.synthetic.main.next_fragment_2.view.*

class NextFragment2 : Fragment() {

    companion object {
        fun newInstance() = NextFragment2()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.next_fragment_2, container, false)

        view.next_2_back_button.setOnClickListener {
            findNavController().navigate(R.id.action_global_go_main)
        }

        return view
    }
}

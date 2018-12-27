package io.github.jimmysharp.navigationsample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.jimmysharp.navigationsample.R
import kotlinx.android.synthetic.main.next_fragment_1.view.*

class NextFragment1 : Fragment() {

    companion object {
        fun newInstance() = NextFragment1()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.next_fragment_1, container, false)

        view.next_1_next_button.setOnClickListener {
            findNavController().navigate(R.id.action_next1_go_next)
        }

        return view
    }
}

package io.github.jimmysharp.navigationsample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.github.jimmysharp.navigationsample.R
import kotlinx.android.synthetic.main.login_fragment.view.*

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.login_fragment, container, false)

        view.login_back_button.setOnClickListener {
            findNavController().navigate(R.id.action_login_go_back)
        }

        return view
    }
}

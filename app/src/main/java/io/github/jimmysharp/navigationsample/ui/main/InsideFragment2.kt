package io.github.jimmysharp.navigationsample.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.jimmysharp.navigationsample.R

class InsideFragment2 : Fragment() {

    companion object {
        fun newInstance() = InsideFragment2()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.inside_fragment_2, container, false)
    }
}

package com.helicoptera.pixures.ui.media

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.helicoptera.pixures.R

class MediaFragment : Fragment() {

    private lateinit var viewModel: MediaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.media_fragment, container, false)
    }
}
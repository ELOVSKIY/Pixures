package com.helicoptera.pixures.ui.storage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.helicoptera.pixures.R
import com.helicoptera.pixures.databinding.StorageFragmentBinding
import com.helicoptera.pixures.ui.storage.adapter.SourceAdapter

class StorageFragment : Fragment() {

    private lateinit var viewModel: StorageViewModel

    private lateinit var binding: StorageFragmentBinding

    private lateinit var adapter: SourceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = StorageViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = StorageFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner

        adapter = SourceAdapter()
        binding.recycler.adapter = SourceAdapter()

        viewModel.sourceInfo.observe(this) {
            adapter.submitList(it)
        }

        return binding.root
    }
}
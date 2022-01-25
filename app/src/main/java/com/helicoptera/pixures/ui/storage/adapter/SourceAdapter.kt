package com.helicoptera.pixures.ui.storage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.helicoptera.pixures.databinding.SourceListItemBinding
import com.helicoptera.pixures.source.data.SourceInfo

class SourceAdapter : ListAdapter<SourceInfo, SourceAdapter.SourceViewHolder>(this) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SourceViewHolder {
        return SourceViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SourceViewHolder, position: Int) {
        val sourceInfo = getItem(position)
        holder.bind(sourceInfo)
    }

    companion object : DiffUtil.ItemCallback<SourceInfo>() {
        override fun areItemsTheSame(
            oldItem: SourceInfo, newItem: SourceInfo
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: SourceInfo, newItem: SourceInfo
        ): Boolean {
            return oldItem == newItem
        }
    }

    class SourceViewHolder(private val binding: SourceListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(sourceInfo: SourceInfo) {
            binding.sourceInfo = sourceInfo
        }

        companion object {
            fun from(parent: ViewGroup): SourceViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = SourceListItemBinding.inflate(inflater, parent, false)
                return SourceViewHolder(
                    binding
                )
            }
        }
    }
}
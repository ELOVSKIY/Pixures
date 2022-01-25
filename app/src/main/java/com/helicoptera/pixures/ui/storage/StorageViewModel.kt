package com.helicoptera.pixures.ui.storage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.helicoptera.pixures.source.data.SourceInfo
import com.helicoptera.source.SourceManagerProvider

class StorageViewModel : ViewModel() {

    private val sourceMangerProvider = SourceManagerProvider()

    private val _sourceInfo: MutableLiveData<List<SourceInfo>> = MutableLiveData(sourceMangerProvider.getSourceManagers().map {
        it.info
    })
    val sourceInfo: LiveData<List<SourceInfo>>
        get() = _sourceInfo
}
package com.helicoptera.source

import com.helicoptera.pixures.source.SourceManager
import com.helicoptera.pixures.source.telegram.TelegramSourceManager

class SourceManagerProvider {

    fun getSourceManagers() : List<SourceManager> {
        return listOf(
            TelegramSourceManager()
        )
    }
}
package com.helicoptera.pixures.source.telegram

import com.helicoptera.pixures.source.SourceManager
import com.helicoptera.pixures.source.authentication.AuthenticationManager
import com.helicoptera.pixures.source.store.StoreManager

class TelegramSourceManager : SourceManager {
    override fun getAuthenticationManager(): AuthenticationManager {

    }

    override fun getStoreManager(): StoreManager {
        TODO("Not yet implemented")
    }
}
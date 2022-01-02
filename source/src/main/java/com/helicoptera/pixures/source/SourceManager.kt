package com.helicoptera.pixures.source

import com.helicoptera.pixures.source.authentication.AuthenticationManager
import com.helicoptera.pixures.source.store.StoreManager

interface SourceManager {

    fun getAuthenticationManager(): AuthenticationManager


    fun getStoreManager(): StoreManager
}
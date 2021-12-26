package com.helicoptera.pixures.source

interface MediaSourceManager {

    fun getAuthenticationManager(): AuthenticationManager


    fun getStoreManager(): StoreManager
}
package com.helicoptera.pixures.source.authentication

import androidx.annotation.IdRes

interface AuthenticationFactor {

    fun getAuthenticationType(): AuthenticationType

    @IdRes
    fun getAuthenticationTitle(): Int
}
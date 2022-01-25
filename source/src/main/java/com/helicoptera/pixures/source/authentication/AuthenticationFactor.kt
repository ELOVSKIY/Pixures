package com.helicoptera.pixures.source.authentication

import androidx.annotation.IdRes

interface AuthenticationFactor {

    fun getAuthenticationType(): AuthenticationType

    fun authenticate(value: String)
}
package com.helicoptera.pixures.source.authentication

interface AuthenticationManager {

    fun getNextAuthenticationFactor() : AuthenticationFactor
}
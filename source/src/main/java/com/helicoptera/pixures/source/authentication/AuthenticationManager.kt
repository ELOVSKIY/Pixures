package com.helicoptera.pixures.source.authentication

interface AuthenticationManager {

    fun getAuthenticationFactors() : List<AuthenticationFactor>
}
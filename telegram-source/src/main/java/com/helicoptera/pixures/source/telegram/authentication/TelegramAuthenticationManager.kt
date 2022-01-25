package com.helicoptera.pixures.source.telegram.authentication

import com.helicoptera.pixures.source.authentication.AuthenticationFactor
import com.helicoptera.pixures.source.authentication.AuthenticationManager
import org.drinkless.td.libcore.telegram.Client

class TelegramAuthenticationManager : AuthenticationManager {
    override fun getNextAuthenticationFactor(): AuthenticationFactor {
        val client = Client.create(null, null, null)
        return PhoneAuthenticationFactor(client)
    }
}
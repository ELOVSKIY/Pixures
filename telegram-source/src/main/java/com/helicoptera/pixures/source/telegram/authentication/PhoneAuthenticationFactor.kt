package com.helicoptera.pixures.source.telegram.authentication

import com.helicoptera.pixures.source.authentication.AuthenticationFactor
import com.helicoptera.pixures.source.authentication.AuthenticationType
import org.drinkless.td.libcore.telegram.Client
import org.drinkless.td.libcore.telegram.TdApi

class PhoneAuthenticationFactor(private val client: Client)  : AuthenticationFactor {
    override fun getAuthenticationType(): AuthenticationType = AuthenticationType.PHONE_NUMBER



    override fun authenticate(value: String) {
        client.send(
            TdApi.SendPhoneNumberVerificationCode(value,
            TdApi.PhoneNumberAuthenticationSettings(
                false, false, true, false, arrayOf()
            ))
        ) {

        }
    }
}
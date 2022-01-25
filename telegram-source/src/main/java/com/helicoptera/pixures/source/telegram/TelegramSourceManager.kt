package com.helicoptera.pixures.source.telegram

import com.helicoptera.pixures.source.SourceManager
import com.helicoptera.pixures.source.authentication.AuthenticationManager
import com.helicoptera.pixures.source.data.SourceInfo
import com.helicoptera.pixures.source.store.StoreManager
import com.helicoptera.pixures.source.telegram.authentication.TelegramAuthenticationManager
import org.drinkless.td.libcore.telegram.Client
import org.drinkless.td.libcore.telegram.TdApi

class TelegramSourceManager : SourceManager {

    override val info: SourceInfo
        get() = SourceInfo("Telegram", "https://commons.wikimedia.org/wiki/File:Telegram_logo.svg")

    override fun getAuthenticationManager(): AuthenticationManager {
        return TelegramAuthenticationManager()
    }

    override fun getStoreManager(): StoreManager {
        TODO("Not yet implemented")
    }
}
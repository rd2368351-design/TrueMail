package com.truemail.core.domain.model

data class Account(
    val id: String,
    val email: String,
    val name: String,
    val provider: EmailProvider,
    val isActive: Boolean = true,
    val unreadCount: Int = 0
)

enum class EmailProvider {
    GMAIL, OUTLOOK, YAHOO, CUSTOM_IMAP
}
package com.truemail.core.domain.model

import java.time.Instant

data class EmailMessage(
    val id: Long,
    val messageId: String,
    val subject: String?,
    val from: String,
    val to: List<String>,
    val date: Instant,
    val bodyPreview: String?,
    val isRead: Boolean = false,
    val isFlagged: Boolean = false,
    val hasAttachments: Boolean = false,
    val isEncrypted: Boolean = false,
    val priority: MessagePriority = MessagePriority.NORMAL,
    val folderId: String,
    val accountId: String,
    val size: Long = 0
)

enum class MessagePriority {
    LOW, NORMAL, HIGH
}
package com.sungsu.community.core.common.utils

import java.util.UUID

object IdUtils {
    fun generate(no: Long): String {
        val uuid = UUID.fromString(no.toString())
        return uuid.toString()
    }

    fun generate(): String {
        val uuid = UUID.randomUUID()
        return uuid.toString()
    }
}

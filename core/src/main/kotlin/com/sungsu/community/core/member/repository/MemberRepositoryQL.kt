package com.sungsu.community.core.member.repository

interface MemberRepositoryQL {
    fun findAllByName(name: String): List<MemberEntity>
}

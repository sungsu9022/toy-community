package com.sungsu.community.api.app.member.service

import com.sungsu.community.api.app.member.MemberDto
import com.sungsu.community.api.app.member.mapper.MemberDtoMapper
import com.sungsu.community.core.common.utils.IdUtils
import com.sungsu.community.core.member.models.MemberVO
import com.sungsu.community.core.member.models.MemberVOMapper
import com.sungsu.community.core.member.repository.MemberRepository
import com.sungsu.community.core.member.service.MemberService
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class MemberResisterService(
    private val memberRepository: MemberRepository,
    private val memberDtoMapper: MemberDtoMapper,
    private val memberVOMapper: MemberVOMapper,
) : MemberService(memberRepository, memberVOMapper) {
    companion object {
        private val logger = KotlinLogging.logger {}
    }

    fun resisterMember(memberDto: MemberDto): MemberVO {
        val id = IdUtils.generate()
        val memberEntity = memberDtoMapper.convertToEntity(memberDto, id)
        logger.debug { "memberEntity : $memberEntity" }
        val saved = memberRepository.save(memberEntity)
        logger.debug { "memberEntity : $memberEntity, saved : $saved" }
        return memberVOMapper.convertToTarget(saved)
    }
}

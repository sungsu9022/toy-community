package com.sungsu.community.core.member.service

import com.sungsu.community.core.common.exception.ErrorCode
import com.sungsu.community.core.common.exception.ServiceException
import com.sungsu.community.core.member.models.MemberVO
import com.sungsu.community.core.member.models.MemberVOMapper
import com.sungsu.community.core.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository,
    private val memberVOMapper: MemberVOMapper
) {

    fun getMemberById(id: String): MemberVO {
        return memberRepository.findById(id)
            ?.let { memberVOMapper.convertToTarget(it) }
            ?: throw ServiceException(ErrorCode.NOT_FOUND)
    }

    fun getMembersByName(name: String): List<MemberVO> {
        return memberRepository.findAllByName(name)
            .map { memberVOMapper.convertToTarget(it) }
    }
}

package com.sungsu.community.core.member.models

import com.sungsu.community.core.common.mapper.GenericMapper
import com.sungsu.community.core.member.repository.MemberEntity
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface MemberVOMapper : GenericMapper<MemberEntity, MemberVO> {
    companion object {
        val INSTANCE: MemberVOMapper = Mappers.getMapper(MemberVOMapper::class.java)
    }
}

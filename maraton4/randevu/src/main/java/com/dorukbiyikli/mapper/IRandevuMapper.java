package com.dorukbiyikli.mapper;

import com.dorukbiyikli.dto.request.RandevuSaveRequestDto;
import com.dorukbiyikli.dto.response.RandevuResponseDto;
import com.dorukbiyikli.repository.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRandevuMapper {
    IRandevuMapper INSTANCE=Mappers.getMapper(IRandevuMapper.class);

    Randevu dtoToRandevu(RandevuSaveRequestDto dto);
    RandevuResponseDto randevuToDto(Randevu randevu);
}

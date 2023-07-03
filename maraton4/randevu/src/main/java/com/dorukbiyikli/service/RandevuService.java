package com.dorukbiyikli.service;

import com.dorukbiyikli.dto.request.RandevuSaveRequestDto;
import com.dorukbiyikli.dto.response.RandevuResponseDto;
import com.dorukbiyikli.exceptions.ErrorType;
import com.dorukbiyikli.exceptions.RandevuException;
import com.dorukbiyikli.mapper.IRandevuMapper;
import com.dorukbiyikli.repository.IRandevuRepository;
import com.dorukbiyikli.repository.entity.Randevu;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class RandevuService {
    IRandevuRepository repository;

    public RandevuResponseDto save(RandevuSaveRequestDto dto) {
        Randevu randevu=IRandevuMapper.INSTANCE.dtoToRandevu(dto);
        List<Randevu> control=repository.findAll();
        control.forEach(x->{
            if(x.getMonth()==dto.getMonth()&&x.getDay()==dto.getMonth()&&x.getHour()==dto.getHour())
                throw new RandevuException(ErrorType.BAD_REQUEST_ERROR,"Seçtiğiniz randevu saati dolu. Lütfen başka bir saat aralığını deneyiniz");
        });
        repository.save(randevu);
        RandevuResponseDto resDto=IRandevuMapper.INSTANCE.randevuToDto(randevu);
        return resDto;
    }

    public List<RandevuResponseDto> findAllActiveRandevu() {
        List<RandevuResponseDto> resDtoList=new ArrayList<>();
        List<Randevu> rndList=repository.findAllByState(Boolean.TRUE);
        rndList.forEach(x->{
            RandevuResponseDto dto=IRandevuMapper.INSTANCE.randevuToDto(x);
            resDtoList.add(dto);
        });
        return resDtoList;
    }

    public List<RandevuResponseDto> cancel(String name,String phone) {
        List<Randevu> rnList=repository.findAll();
        List<RandevuResponseDto> resDtoList=new ArrayList<>();
        rnList.forEach(x->{
            if(x.getName().toUpperCase().trim()==name.toUpperCase().trim()&&x.getPhone()==phone){
                x.setState(false);
                RandevuResponseDto dto=IRandevuMapper.INSTANCE.randevuToDto(x);
                resDtoList.add(dto);
            }
        });
        return resDtoList;
    }


}
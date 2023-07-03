package com.dorukbiyikli.controller;


import static com.dorukbiyikli.constants.RestApiList.*;
import com.dorukbiyikli.dto.request.RandevuSaveRequestDto;
import com.dorukbiyikli.dto.response.RandevuResponseDto;
import com.dorukbiyikli.repository.entity.Randevu;
import com.dorukbiyikli.service.RandevuService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping(RANDEVU)
public class RandevuController {
    private final RandevuService service;

    @PostMapping(SAVEDTO)
    public RandevuResponseDto save(@Valid RandevuSaveRequestDto dto){
        return service.save(dto);
    }
    @GetMapping(FINDALL)
    public List<RandevuResponseDto> findAll(){
        return service.findAllActiveRandevu();
    }
    @PostMapping(CANCEL)
    public List<RandevuResponseDto> cancel(String name,String phone){
        return service.cancel(name,phone);
    }

}
package com.dorukbiyikli.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RandevuResponseDto {
    String name;
    Long dateDay;
    Long dateTime;
}

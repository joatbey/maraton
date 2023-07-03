package com.dorukbiyikli.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RandevuSaveRequestDto {

    String name;

    String phone;

    Long dateDay;

    Long dateTime;
    @NotNull
    @Range(min = 1,max = 31)
    Integer day;
    @NotNull
    @Range(min = 1,max = 12)
    Integer month;
    Integer year;
    @NotNull
    @Range(min = 9,max = 17)
    Integer hour;


}

package com.dorukbiyikli.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblrandevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phone;
    Long dateDay;
    Long dateTime;
    @Builder.Default
    Boolean state=true;

    @Range(min = 1,max = 31)
    Integer day;

    @Range(min = 1,max = 12)
    Integer month;
    Integer year;

    @Range(min = 9,max = 17)
    Integer hour;


}

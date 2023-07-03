package com.dorukbiyikli.repository;

import com.dorukbiyikli.repository.entity.Randevu;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRandevuRepository extends JpaRepository<Randevu, Long> {

    List<Randevu> findAllByState(Boolean state);
    Randevu findByName(String name);

}

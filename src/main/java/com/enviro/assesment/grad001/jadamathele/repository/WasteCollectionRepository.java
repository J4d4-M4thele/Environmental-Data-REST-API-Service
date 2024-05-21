package com.enviro.assesment.grad001.jadamathele.repository;

import com.enviro.assesment.grad001.jadamathele.entity.WasteCollection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WasteCollectionRepository extends JpaRepository<WasteCollection, Long> {
    Optional<WasteCollection> findByYear(Long year);
}

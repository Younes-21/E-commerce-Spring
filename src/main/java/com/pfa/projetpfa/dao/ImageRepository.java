package com.pfa.projetpfa.dao;

import com.pfa.projetpfa.service.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

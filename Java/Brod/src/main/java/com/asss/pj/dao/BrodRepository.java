package com.asss.pj.dao;

import com.asss.pj.entity.Brod;
import com.asss.pj.util.Namena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrodRepository extends JpaRepository<Brod, Integer> {
    @Query("FROM Brod WHERE namena = ?1 ORDER BY NAMENA ASC")
    List<Brod> findAllPutnicki(Namena namena);
}


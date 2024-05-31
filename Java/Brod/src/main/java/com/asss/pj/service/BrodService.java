package com.asss.pj.service;

import com.asss.pj.entity.Brod;
import com.asss.pj.util.Namena;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BrodService {
    List<Brod> findAll();

    List<Brod> findAllPutnicki(Namena namena);

    Brod save(Brod brod);

    String deleteById(int id);

    Brod findById(int id);

    List<Brod> findAll(Sort gorivo);
}

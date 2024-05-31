package com.asss.pj.service;

import com.asss.pj.dao.BrodRepository;
import com.asss.pj.entity.Brod;
import com.asss.pj.util.Namena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrodServiceImpl implements BrodService {

    @Autowired
    private BrodRepository brodRepository;

    @Override
    public Brod findById(int id) {
        return brodRepository.findById(id).orElse(null);
    }

    @Override
    public List<Brod> findAll() {
        return brodRepository.findAll();
    }

    @Override
    public List<Brod> findAllPutnicki(Namena namena) {
        return brodRepository.findAllPutnicki(namena);
    }

    @Override
    public Brod save(Brod brod) {
        return brodRepository.save(brod);
    }

    @Override
    public String deleteById(int id) {
        Brod brod = brodRepository.findById(id).orElse(null);
        if (brod != null) {
            brodRepository.deleteById(id);
            return "Brod (" + id + ") je izbrisan!";
        } else {
            return "Brod (" + id + ") nije pronadjen!";
        }
    }

    @Override
    public List<Brod> findAll(Sort gorivo) {

        return brodRepository.findAll(Sort.by(Sort.Direction.ASC, "Gorivo"));
    }
}

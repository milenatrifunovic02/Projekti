package com.asss.pj.controller;

import com.asss.pj.entity.Brod;
import com.asss.pj.service.BrodService;
import com.asss.pj.util.LoggerHelper;
import com.asss.pj.util.Namena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrodRestController {

    @Autowired
    private BrodService brodService;

    @GetMapping("/brod")
    List<Brod> findAll() {
        return brodService.findAll();
    }

    @GetMapping("/brod/{namena}")
    List<Brod> findAllPutnicki(@PathVariable Namena namena) {
        return brodService.findAllPutnicki(namena);
    }

    @GetMapping("/brod/gorivo")
    List<Brod> findAllFuelType() {
        return brodService.findAll(Sort.by("Gorivo"));
    }

    @PostMapping("/brod")
    Brod addBrod(@RequestBody Brod brod) {
        return brodService.save(brod);
    }

    @PutMapping("/brod")
    Brod editBrod(@RequestBody Brod brod){
        return brodService.save(brod);
    }

    @DeleteMapping("/brod/{id}")
    String removeBrod(@PathVariable int id) {
        Brod brod = brodService.findById(id);
        if (brod != null) {
            brodService.deleteById(id);
            LoggerHelper.proveraPutnicki(brodService.findAll());
            LoggerHelper.proveraTanker(brodService.findAll());
            LoggerHelper.proveraTeretni(brodService.findAll());
            LoggerHelper.proveraVojni(brodService.findAll());
            return "Brod (" + id + ") je obrisan!";
        } else {
            return "Brod (" + id + ") nije pronadjen!";
        }
    }
}

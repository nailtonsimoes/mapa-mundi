package com.api.mapamundi.controllers;


import com.api.mapamundi.models.Pais;
import com.api.mapamundi.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PaisResource {

    @Autowired
    PaisRepository paisRepository;

    @GetMapping("/paises")
    public List<Pais> getAllPaises(){
        return paisRepository.findAll();
    }

    @GetMapping("/pais/{id}")
    public Pais getOneById(@PathVariable(value = "id") long id){
        return paisRepository.findById(id);
    }

    @DeleteMapping("/pais/{id}")
    public void deletePais(@PathVariable("id") long id){
        paisRepository.removeById(id);
    }

    @PostMapping("/pais")
    public Pais postPais(@RequestBody Pais pais){
        return paisRepository.save(pais);
    }

    @PutMapping()
    public Pais putPais(@RequestBody Pais pais){
        return paisRepository.save(pais);
    }

}

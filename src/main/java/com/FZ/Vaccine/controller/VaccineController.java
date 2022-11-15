package com.FZ.Vaccine.controller;

import com.FZ.Vaccine.Repository.VaccineRepository;
import com.FZ.Vaccine.Repository.VaccineVialRepository;
import com.FZ.Vaccine.model.Vaccine;
import com.FZ.Vaccine.model.VaccineVial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
public class VaccineController {
    @Autowired
    VaccineRepository vaccineRepository;
    @Autowired
    VaccineVialRepository vaccineVialRepository;

    @PostMapping("/vaccineVials")
    public VaccineVial saveVaccineVial(@Valid  @RequestBody VaccineVial vaccineVial){
        return vaccineVialRepository.save(vaccineVial);
    }

    @GetMapping("/vaccineVials")
    public List<VaccineVial> getAllVaccineVials(){
        return vaccineVialRepository.findAll();
    }
    @GetMapping("/vaccineVials/{$id}")
    public VaccineVial getVaccineVialById(@PathVariable("id") UUID vaccineVialId){
        return vaccineVialRepository.findById(vaccineVialId).get();
    }
    @GetMapping("/vaccineVials")
    public List<VaccineVial> getVaccineVialByVaccineMaker(@RequestParam String vaccineMaker){
        return vaccineVialRepository.findAllByVaccineMaker(vaccineMaker);
    }
    @GetMapping("/vaccines")
    public List<Vaccine> getVaccines(){
        return vaccineRepository.findAll();
    }
    @PostMapping("/vaccines")
    public Vaccine administerVaccine(@Valid  @RequestBody Vaccine vaccine){
        return vaccineRepository.save(vaccine);
    }
}



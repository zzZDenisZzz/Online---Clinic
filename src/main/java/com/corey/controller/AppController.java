package com.corey.controller;

import com.corey.entity.Patient;
import com.corey.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AppController {

    private final PatientService patientService;

    @Autowired
    public AppController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/patients")
    public String getAllPatients(Model model){
        model.addAttribute("patients" , patientService.findAll());
        return "patientsList";
    }

    @GetMapping("/patient/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("patient", patientService.findById(id));
        return "showPatient";
    }

    @GetMapping("/addPatient")
    public String recordVisits(){
        return "recordPatient";
    }

    @PostMapping("/addPatient")
    public String addPatient(@ModelAttribute("patient")Patient patient){
        patientService.save(patient);
        return "redirect:/patients";
    }
}

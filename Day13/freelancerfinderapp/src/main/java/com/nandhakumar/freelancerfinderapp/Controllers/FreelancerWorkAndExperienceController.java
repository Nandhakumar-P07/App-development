package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerWorkAndExperienceModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerWorkAndExperienceService;

@RestController
public class FreelancerWorkAndExperienceController {
    
    @Autowired
    private FreelancerWorkAndExperienceService fwes;

    @GetMapping("/getfreelancerworkandexperience")
    public List<FreelancerWorkAndExperienceModel> getdata(){
        return fwes.getdata();
    }
}

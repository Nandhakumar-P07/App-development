package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerSkillsModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerSkillsService;

@RestController
public class FreelancerSkillsController {
    
    @Autowired
    private FreelancerSkillsService fss;

    @GetMapping("/getfreelancerskills")
    public List<FreelancerSkillsModel> getdata(){
        return fss.getdata();
    }
}

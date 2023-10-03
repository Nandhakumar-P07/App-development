package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerProjectsModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerProjectsService;

@RestController
public class FreelancerProjectsController {
    
    @Autowired
    private FreelancerProjectsService fps;

    @GetMapping("/getfreelancerprojects")
    public List<FreelancerProjectsModel> getdata(){
        return fps.getdata();
    }
}

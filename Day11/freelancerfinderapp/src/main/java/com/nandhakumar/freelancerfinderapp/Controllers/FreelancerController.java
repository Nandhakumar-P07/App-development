package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerService;

@RestController
public class FreelancerController {
    
    @Autowired
    private FreelancerService fs;

    @GetMapping("/getfreelancerdata")
    public List<FreelancerModel> getdata(){
        return fs.getdata();
    }

    @PostMapping("/savedata")
    public FreelancerModel savedata(@RequestBody FreelancerModel fm){
        return fs.savedata(fm);
    }
}

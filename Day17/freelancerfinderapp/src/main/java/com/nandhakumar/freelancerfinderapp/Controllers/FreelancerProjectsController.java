package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/savefreelancerprojects")
    public FreelancerProjectsModel savedata(@RequestBody FreelancerProjectsModel fpm){
        return fps.savedata(fpm);
    }

    @PutMapping("/updatefreelancerprojects")
    public FreelancerProjectsModel updatedata(@RequestBody FreelancerProjectsModel fpm,@PathVariable int id){
        return fps.updatedata(fpm, id);
    }

    @DeleteMapping("/deletefreelancerprojects")
    public void deletedata(int id){
        fps.deletedata(id);
    }
}

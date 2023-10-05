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

import com.nandhakumar.freelancerfinderapp.Models.FreelancerEducationModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerEducationService;

@RestController
public class FreelancerEducationController {
    
    @Autowired
    private FreelancerEducationService fes;

    @GetMapping("/getfreelancereducation")
    public List<FreelancerEducationModel> getdata(){
        return fes.getdata();
    }

    @PostMapping("/savefreelancereducation")
    public FreelancerEducationModel savedata(@RequestBody FreelancerEducationModel fem){
        return fes.savedata(fem);
    }

    @PutMapping("/updatefreelancereducation")
    public FreelancerEducationModel updatedata(@RequestBody FreelancerEducationModel fem,@PathVariable int id){
        return fes.updatedata(fem, id);
    }

    @DeleteMapping("/deletefreelancereducation")
    public void deletedata(int id){
        fes.deletedata(id);
    }
}

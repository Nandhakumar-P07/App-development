package com.nandhakumar.freelancerfinderapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerModel;
import com.nandhakumar.freelancerfinderapp.Services.FreelancerService;
import com.nandhakumar.freelancerfinderapp.constant.Api;
import com.nandhakumar.freelancerfinderapp.dto.request.FreelancerAuthenticationRequest;
import com.nandhakumar.freelancerfinderapp.dto.request.FreelancerRegisterRequest;
import com.nandhakumar.freelancerfinderapp.dto.response.FreelancerAuthenticationResponse;

@RestController
@RequestMapping(Api.FREELANCERAUTH)
@CrossOrigin("*")
public class FreelancerController {
    
    @Autowired
    private FreelancerService fs;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody FreelancerRegisterRequest request) {
        boolean isRegistered = fs.freelancerRegistration(request);
        return isRegistered ? ResponseEntity.ok("User registered successfully")
                : ResponseEntity.badRequest().body("Sommething went wrong!");
    }

    @PostMapping("/login")
    public ResponseEntity<FreelancerAuthenticationResponse> authenticate(@RequestBody FreelancerAuthenticationRequest request) {
        return ResponseEntity.ok(fs.freelancerAuthentication(request));
    }

    @GetMapping("/getbyid/{id}")
    public FreelancerModel getbyid(@PathVariable int id){
        return fs.getbyid(id);
    }

    @GetMapping("/getfreelancerdata")
    public List<FreelancerModel> getdata(){
        return fs.getdata();
    }

    @PostMapping("/savefreelancerdata")
    public FreelancerModel savedata(@RequestBody FreelancerModel fm){
        return fs.savedata(fm);
    }

    @PutMapping("/updatefreelancerdata")
    public FreelancerModel updatedata(@RequestBody FreelancerModel fm,@RequestParam int id){
        return fs.updatedata(fm, id);
    }

    @DeleteMapping("/deletefreelancerdata")
    public void deletedata(@RequestParam int id){
        fs.deletedata(id);
    }


}

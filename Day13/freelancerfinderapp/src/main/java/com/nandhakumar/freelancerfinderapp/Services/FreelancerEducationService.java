package com.nandhakumar.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerEducationModel;
import com.nandhakumar.freelancerfinderapp.Repo.FreelancerEducationRepoInt;

@Service
public class FreelancerEducationService {
    
    @Autowired
    private FreelancerEducationRepoInt feri;

    public List<FreelancerEducationModel> getdata(){
        return feri.findAll();
    }
}

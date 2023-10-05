package com.nandhakumar.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerWorkAndExperienceModel;
import com.nandhakumar.freelancerfinderapp.Repo.FreelancerWorkAndExperienceRepoInt;

@Service
public class FreelancerWorkAndExperienceService {
    
    @Autowired
    private FreelancerWorkAndExperienceRepoInt fweri;

    public List<FreelancerWorkAndExperienceModel> getdata(){
        return fweri.findAll();
    }
}

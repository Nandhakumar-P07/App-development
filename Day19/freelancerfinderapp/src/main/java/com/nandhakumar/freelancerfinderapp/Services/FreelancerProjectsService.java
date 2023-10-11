package com.nandhakumar.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandhakumar.freelancerfinderapp.Models.FreelancerProjectsModel;
import com.nandhakumar.freelancerfinderapp.Repo.FreelancerProjectsRepoInt;

@Service
public class FreelancerProjectsService {
    
    @Autowired
    private FreelancerProjectsRepoInt fpri;

    public List<FreelancerProjectsModel> getdata(){
        return fpri.findAll();
    }

    public FreelancerProjectsModel savedata(FreelancerProjectsModel fem){
        return fpri.save(fem);
    }

    public FreelancerProjectsModel updatedata(FreelancerProjectsModel fem,int id){
        fem.setId(id);
        return fpri.save(fem);
    }

    public void deletedata(int id){
        fpri.deleteById(id);
    }
}

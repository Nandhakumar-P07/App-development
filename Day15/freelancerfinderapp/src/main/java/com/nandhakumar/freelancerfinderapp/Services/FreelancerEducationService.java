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

    public FreelancerEducationModel savedata(FreelancerEducationModel fem){
        return feri.save(fem);
    }

    public FreelancerEducationModel updatedata(FreelancerEducationModel fem,int id){
        fem.setId(id);
        return feri.save(fem);
    }

    public void deletedata(int id){
        feri.deleteById(id);
    }
}

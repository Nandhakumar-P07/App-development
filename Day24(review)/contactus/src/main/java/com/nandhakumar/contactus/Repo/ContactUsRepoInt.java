package com.nandhakumar.contactus.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nandhakumar.contactus.Models.ContactUsModel;

@Repository
public interface ContactUsRepoInt extends JpaRepository<ContactUsModel,Integer>{
    
}

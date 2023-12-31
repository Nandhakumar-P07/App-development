package com.nandhakumar.freelancerfinderapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandhakumar.freelancerfinderapp.client.ContactUsClient;
import com.nandhakumar.freelancerfinderapp.vo.ContactUs;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ContactUsService {
    
    private ContactUsClient cuc;

    public List<ContactUs> getContactUs(){
        return cuc.getdata();
    }

    public ContactUs savedata(ContactUs cu){
        return cuc.savedata(cu);
    }
}

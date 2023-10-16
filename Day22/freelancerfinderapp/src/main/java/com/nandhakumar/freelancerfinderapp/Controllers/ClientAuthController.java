package com.nandhakumar.freelancerfinderapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandhakumar.freelancerfinderapp.Services.ClientService;
import com.nandhakumar.freelancerfinderapp.constant.Api;
import com.nandhakumar.freelancerfinderapp.dto.request.ClientAuthenticationRequest;
import com.nandhakumar.freelancerfinderapp.dto.request.ClientRegisterRequest;
import com.nandhakumar.freelancerfinderapp.dto.response.ClientAuthenticationResponse;

@RestController
@RequestMapping(Api.CLIENTAUTH)
@CrossOrigin("*")
public class ClientAuthController {
    
    @Autowired
    private ClientService cs;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody ClientRegisterRequest request) {
        boolean isRegistered = cs.clientRegistration(request);
        return isRegistered ? ResponseEntity.ok("User registered successfully")
                : ResponseEntity.badRequest().body("Sommething went wrong!");
    }

    @PostMapping("/login")
    public ResponseEntity<ClientAuthenticationResponse> authenticate(@RequestBody ClientAuthenticationRequest request) {
        return ResponseEntity.ok(cs.clientAuthentication(request));
    }
}

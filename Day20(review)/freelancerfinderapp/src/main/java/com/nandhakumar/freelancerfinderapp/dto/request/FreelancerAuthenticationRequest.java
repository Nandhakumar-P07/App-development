package com.nandhakumar.freelancerfinderapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreelancerAuthenticationRequest {
    private String email;
    private String password;
}

package com.nandhakumar.freelancerfinderapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreelancerAuthenticationResponse {
    private String token;
    private int id;
}

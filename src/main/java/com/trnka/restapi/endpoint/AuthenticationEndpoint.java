package com.trnka.restapi.endpoint;

import com.trnka.restapi.dto.LoginDTO;
import com.trnka.restapi.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "authentication", url = "${vst.rest.url}")
@RequestMapping("/authentication")
public interface AuthenticationEndpoint {

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDTO> authenticate(@RequestBody LoginDTO requestDTO);
}

package com.trnka.restapi.endpoint;

import javax.ws.rs.QueryParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnka.restapi.dto.StudentDTO;
import com.trnka.restapi.dto.SyncDto;

@FeignClient(name = "sync", url = "${vst.rest.url}", decode404 = true)
@RequestMapping("/vst/student")
public interface StudentSyncEndpoint {

    @RequestMapping(method = RequestMethod.GET)
    StudentDTO getStudent(@QueryParam("studentId") String studentId);

    @RequestMapping(method = RequestMethod.GET, path = "syncAll")
    SyncDto syncAll();

}

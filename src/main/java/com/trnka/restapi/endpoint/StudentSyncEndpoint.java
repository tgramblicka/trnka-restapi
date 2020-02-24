package com.trnka.restapi.endpoint;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnka.restapi.dto.StudentDTO;
import com.trnka.restapi.dto.SyncDto;

@RequestMapping("/vst/student/")
public interface StudentSyncEndpoint {

    @RequestMapping(method = RequestMethod.GET)
    StudentDTO getTest(@QueryParam("studentId") String studentId);

    @RequestMapping(method = RequestMethod.GET, path = "syncAll")
    SyncDto syncAll();

}

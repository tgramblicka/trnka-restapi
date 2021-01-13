package com.trnka.restapi.endpoint;

import javax.ws.rs.QueryParam;

import com.trnka.restapi.dto.statistics.DeviceStatisticsSyncDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trnka.restapi.dto.StudentDTO;
import com.trnka.restapi.dto.SyncDto;

@FeignClient(name = "sync", url = "${vst.rest.url}", decode404 = true)
@RequestMapping("/vst/sync")
public interface SyncEndpoint {

    @RequestMapping(method = RequestMethod.GET)
    StudentDTO getStudent(@QueryParam("studentId") String studentId);

    @RequestMapping(method = RequestMethod.GET, path = "all")
    SyncDto syncAll();

    @RequestMapping(method = RequestMethod.POST, path = "examination-statistics")
    Boolean updateExaminationStatisticsToAllStudents(@RequestBody DeviceStatisticsSyncDto dto);



}

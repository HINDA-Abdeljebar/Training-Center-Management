package com.master.trainingcentermanagement.controller;

import com.master.trainingcentermanagement.entities.Schedule;
import com.master.trainingcentermanagement.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {


    @Autowired
    ScheduleService scheduleService;
    @PostMapping("/addschedule")
    public Schedule addschedule(@RequestBody Schedule schedule){
        return scheduleService.saveParticipant(schedule);

    }

    @GetMapping("/findschedule")
    public List<Schedule> findSchedule(){

        return scheduleService.listschedule();
    }

    @DeleteMapping("deleteSchedule/{id}")
    public void  deleteSchedule(@PathVariable Long id){
        scheduleService.deleteschedule(id);
    }

}
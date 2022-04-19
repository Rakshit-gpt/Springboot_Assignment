package com.springrest.springrest.Controller;

import com.springrest.springrest.entites.Courses;
import com.springrest.springrest.services.CousreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CousreService cousreService;



    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
    //get the cousres

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.cousreService.getCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Courses getCousre(@PathVariable String courseID){
        return this.cousreService.getCourses(Long.parseLong(courseID));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return this.cousreService.addCourse(courses);
    }
}

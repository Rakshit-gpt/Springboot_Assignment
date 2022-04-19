package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entites.Courses;
import org.springframework.context.annotation.Bean;

public interface CousreService {
    public List<Courses> getCourses();



    public Courses getCourses(long courseID);

    public Courses addCourse(Courses courses);
}

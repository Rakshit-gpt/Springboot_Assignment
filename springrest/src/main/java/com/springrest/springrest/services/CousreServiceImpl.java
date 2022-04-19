package com.springrest.springrest.services;

import com.springrest.springrest.entites.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CousreServiceImpl implements CousreService {

    List<Courses> list;

    public CousreServiceImpl() {
        list = new ArrayList<>();
        list.add(new Courses(125, "Java core course", "Basic java content"));
        list.add(new Courses(213, "React js", "Frontend Tech"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourses(long courseID) {
        Courses c = null;
        for (Courses courses : list) {
            if (courses.getId() == courseID) {
                c = courses;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses) {
        list.add(courses);
        return  courses;
    }


}


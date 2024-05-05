package com.example.CourseApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses() {
      return Arrays.asList(
              new Course("100", "ABC", "SOHAIL"),
              new Course("101", "XYZ", "Ramdhas"),
              new Course("102", "SOH", "Zubair")
              );
    }

}

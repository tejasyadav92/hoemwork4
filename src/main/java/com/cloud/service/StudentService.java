package com.cloud.service;

import com.cloud.model.Student;
import com.cloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student addAttendee(Student attendee) {
        studentRepository.save(attendee);
        return attendee;
    }

    public Iterable<Student> getAttendee(){
        return studentRepository.findAll();
    }
}

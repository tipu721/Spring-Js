package org.tipu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.tipu.entity.Student;
import org.tipu.repository.StudentRepo;

@Service
@ComponentScan(basePackages = {"org.tipu.repository"})
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void save(Student student){
       studentRepo.save(student);
    }
}

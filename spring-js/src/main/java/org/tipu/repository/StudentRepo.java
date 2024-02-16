package org.tipu.repository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tipu.entity.Student;

@Repository(@Qualifier "studentRepo")
public interface StudentRepo extends JpaRepository<Student, Id> {
}

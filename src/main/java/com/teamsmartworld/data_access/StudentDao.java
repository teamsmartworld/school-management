package com.teamsmartworld.data_access;

import com.teamsmartworld.models.Student;
import java.util.List;

public interface StudentDao {
    void save(Student student);
    List<Student> findAll();
}

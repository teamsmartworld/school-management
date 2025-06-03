package com.teamsmartworld.services;

import com.teamsmartworld.data_access.StudentDao;
import com.teamsmartworld.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    private final StudentDao studentDao;
    private final UserInputService userInputService;

    @Autowired
    public StudentManagementConsoleImpl(StudentDao studentDao, UserInputService userInputService) {
        this.studentDao = studentDao;
        this.userInputService = userInputService;
    }

    @Override
    public void start() {
        System.out.println("🎓 Welcome to the Student Management System");

        String name = userInputService.prompt("Please enter the student's name:");
        int age = Integer.parseInt(userInputService.prompt("Enter the student's age:"));

        Student student = new Student(name, age);
        studentDao.save(student);

        System.out.println("\n✅ Student successfully added!");
        System.out.println("📄 Current Students: ");
        for (Student s : studentDao.findAll()) {
            System.out.println(s);
        }
    }
}

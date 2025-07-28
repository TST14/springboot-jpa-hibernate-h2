package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @Operation(summary = "Get all students", description = "Returns a list of all students.")
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // NEW: Update Student API
    @Operation(summary = "Update student", description = "Updates a student's details by ID.")
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id,
            @RequestBody Student updatedStudent) {
        return repository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setPassportNumber(updatedStudent.getPassportNumber());
                    Student saved = repository.save(student);
                    return ResponseEntity.ok(saved);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

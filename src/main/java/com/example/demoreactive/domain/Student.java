package com.example.demoreactive.domain;

import org.springframework.data.annotation.Id;

import java.util.Objects;
import java.util.Set;

public record Student(@Id Long id, String firstname, String lastname, Set<Department> departments) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

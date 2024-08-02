package com.example.backend.dao;

import com.example.backend.entities.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*") // "*" allows requests from any origin.
public interface DivisionRepository extends JpaRepository<Division,Long> {

}

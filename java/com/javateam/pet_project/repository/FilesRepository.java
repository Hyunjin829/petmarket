package com.javateam.pet_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javateam.pet_project.entity.Files;

public interface  FilesRepository extends JpaRepository<Files, Integer> {

	Files findByFno(int fno);
}
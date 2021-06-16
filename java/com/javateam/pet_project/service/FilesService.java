package com.javateam.pet_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateam.pet_project.entity.Files;
import com.javateam.pet_project.repository.FilesRepository;

@Service
public class FilesService {
	
	@Autowired
	FilesRepository filesRepository;
	
	public void save(Files files) {
		Files f = new Files();
		f.setFilename(files.getFilename());
		System.out.println("fileRepository의 files.getFilename() : " + files.getFilename());
		f.setFileOriName(files.getFileOriName());
		f.setFileurl(files.getFileurl());
		
		filesRepository.save(f);
	}
}
//JobSeekerServiceImpl.java
package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import com.nt.runners.JobSeekerRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.exception.JobSeekerObjectNotFoundException;
import com.nt.repository.IJobSeekerRepository;

@Service("jobService")
public class JobSeekerServiceImpl implements IJobSeekerService {

  
	@Autowired
	private IJobSeekerRepository jobRepo;


}

package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import com.nt.runners.JobSeekerRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.exception.JobSeekerObjectNotFoundException;
import com.nt.repository.IJobSeekerRepository;

@Service("jobService")
public class JobSeekerServiceImpl implements IJobSeekerService {

  
	@Autowired
	private IJobSeekerRepository jobRepo;


    

	@Override
	public String regiterJobSeeker(JobSeeker seeker) {
		System.out.println("JobSeekerServiceImpl.regiterJobSeeker()");
		JobSeeker job=jobRepo.save(seeker);
		
		return "JobSeeker object is saved :: "+ job.getJsid();
	}
	
	@Override
	public Iterable<JobSeeker> showAllJobSeeker() {
		
		return jobRepo.findAll();
	}
	
	@Override
	public Iterable<JobSeeker> showAllJobSeekerByIds(List<Integer> ids) {
		Iterable<JobSeeker> list = jobRepo.findAllById(ids);
		List jobSeekerList = StreamSupport.stream(list.spliterator(), false).sorted((js1,js2)->js1.getJsname().compareToIgnoreCase(js2.getJsname())).toList();
		return jobSeekerList;
	}
	
	@Override
	public Optional<JobSeeker> showJsById(int id) {
		Optional<JobSeeker> opt= jobRepo.findById(id);
		return opt;
	}
	
	@Override
	public String fetchJsById(int id) {
		Optional<JobSeeker> js= jobRepo.findById(id);
		if(js.isPresent()) {
			JobSeeker job = js.get();
			return "JobSeeker Details :: "+ job;
		}else {
			return "JobSeeker object is not found";
		}
		
	}
	
	 @Override
	public long countOfAllJobSeeker() {
		long count = jobRepo.count();
		return count;
	}
	 
	 @Override
	public boolean showJobSeekerExistsById(int id) {
		if(jobRepo.existsById(id)) {
			return true; 
		}else {
		return false;
		}
	}
	 
	 @Override
	public JobSeeker getJobseekerById(int id) {
	//	JobSeeker job = jobRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
		 // custom exception 
		 JobSeeker job = jobRepo.findById(id).orElseThrow(()->new JobSeekerObjectNotFoundException("Invalid Js ID"));
	//	 JobSeeker job = jobRepo.findById(id).orElse(new JobSeeker());
		return job;
	}
	 
	 @Override
	public String insertOrUpdateJSeeker(int id , String addrs) {
		 
		 Optional<JobSeeker> opt = jobRepo.findById(id);
		 if(opt.isPresent()) {
			 JobSeeker js = opt.get();
			 js.setAddrs(addrs);
			 return "JobSeeker object is updated having id :: "+js.getJsid()+js;
		 }else {
			 return "JobSeeker object is not found";
		 }
	}
}

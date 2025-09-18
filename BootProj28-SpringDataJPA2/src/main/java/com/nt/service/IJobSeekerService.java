package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.JobSeeker;

public interface IJobSeekerService {
	
	public String regiterJobSeeker(JobSeeker seeker);
	public Iterable<JobSeeker> showAllJobSeeker();
	public Iterable<JobSeeker> showAllJobSeekerByIds(List<Integer> ids);
	public Optional<JobSeeker> showJsById(int id);
	public String fetchJsById(int id);
	public long countOfAllJobSeeker();
	public boolean showJobSeekerExistsById(int id);
	public JobSeeker getJobseekerById(int id);
	public String insertOrUpdateJSeeker(int id , String addrs);
	public String removeJsById(int id);
	public String removeAllJsByIds(Iterable<Integer> ids);
	public String removeAllJobSeeker(Iterable<Integer> ids);
	public String removeAll();
	public String removeJsByIdObj(int id);
	public String regiterChunkOfJobSeeker(Iterable<JobSeeker> js);
	
	
}

package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer>{

	
	// data jps repository custom methods
	
	public List<JobSeeker> findByAddrsEquals(String addrs);
	public List<JobSeeker> readByAddrsEquals(String addrs);
	public List<JobSeeker> getByAddrsEquals(String addrs);
	public List<JobSeeker> findByJsnameEqualsIgnoreCase(String name);
	
	public List<JobSeeker> findByExpectedSalaryBetween(double start , double end);
	
	public List<JobSeeker> findByExpectedSalaryGreaterThanAndExpectedSalaryLessThan(double start , double end);
	public List<JobSeeker> findByExpectedSalaryGreaterThanEqualAndExpectedSalaryLessThanEqual(double start , double end);
	public List<JobSeeker> findByAddrsInOrderByAddrsAsc(List<String> cities);
	
	public List<JobSeeker> findByJsnameStartingWith(String name);
	public List<JobSeeker> findByAddrsEndingWith(String name);
	public List<JobSeeker> findByJsnameContaining(String name);
	
	public List<JobSeeker> findByJsnameLikeOrAddrsLike(String name , String addrs);
	
}

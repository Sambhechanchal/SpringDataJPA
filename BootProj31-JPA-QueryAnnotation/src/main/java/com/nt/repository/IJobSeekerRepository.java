package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.JobSeeker;

import jakarta.transaction.Transactional;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer>{

	
	// named parameter and property name should be match
	//@Query("FROM JobSeeker WHERE expectedSalary>=:start AND expectedSalary<=:end")
	//public List<JobSeeker> searchJobSeekerByExpectedSalary(@Param("start")double start, @Param("end")double end);
	
	
	// ordinal positional parameter , sequence shuld be same , HQL ---> internally convert into the sql Native db s/w
	/*
	@Query("FROM JobSeeker WHERE expectedSalary>=?1  AND expectedSalary<=?2")
	public List<JobSeeker> searchJobSeekerByExpectedSalary(double start, double end);
	*/
	
	// ============select entity Query =========================
	@Query("FROM JobSeeker WHERE expectedSalary>=?1 AND expectedSalary<=?2 ")
	public List<JobSeeker> searchAllJobSeeker(double start, double end);
	
	// ================ specific to multiple col value of table =============
	
	@Query("SELECT jsname , addrs , qlfy FROM JobSeeker")
	public List<Object[]> searchJobSeekerMulColVal();
	
	//============= single col value of table
	
	@Query("SELECT jsname FROM JobSeeker Order By jsname Asc")
	public List<String> searchJobSeekerSglColVal();
	
	// ============= single row all column  entity query====================
	@Query("FROM JobSeeker WHERE jsname = ?1" )
	public Optional<JobSeeker> getJobSeeker(String jsname);
	
	//=============multiple column value====================
	@Query("SELECT jsname , addrs , qlfy FROM JobSeeker WHERE jsid =?1")
	public Optional<Object> getJobSeekerDeatils(int id);
	
	//==================single row  single column value ===================
	@Query("SELECT jsname FROM JobSeeker WHERE jsid=?1")
	public Optional<String> getJsName(int id);
	
	
	// Query for aggregate function
	
	@Query("SELECT DISTINCT COUNT(jsname) FROM JobSeeker")
	public long getDistinctCount();
	
	@Query("Select count(*), sum(expectedSalary) , min(expectedSalary), max(expectedSalary), avg(expectedSalary) FROM JobSeeker")
	public Object getAggregateData();
	
	// non-select update operation
	
	@Query("update JobSeeker Set expectedSalary = expectedSalary+(expectedSalary *:percent/100.0) Where jsid =:id")
	@Modifying
	@Transactional   // mandatory otherwise query will not be execute 
	public int jobSeekerExcepectSalaryInc(double percent , int id);
	
	// non-select delete query
	@Query("delete From JobSeeker Where jsname =:name")
	@Modifying
	@Transactional
	public int deleteJobSeekerByJsname(String name);
	
	// native Query SQL
	@Query(value="Select sysdate from dual" , nativeQuery=true)
	public String showSystemDateAndTime();
	
	@Query(value="create table Temperature6(degree Number(4), Farenhite Number(4))" , nativeQuery=true)
	@Transactional
	@Modifying
	public int createTable();
	
}


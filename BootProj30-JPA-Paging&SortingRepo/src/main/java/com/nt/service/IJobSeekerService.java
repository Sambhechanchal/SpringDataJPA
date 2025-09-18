//IJobSeekerService.java
package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeeker;

public interface IJobSeekerService {
	
	public String deleteJsByIdsInBatch(List<Integer> ids);
	public List<JobSeeker> showJobSeekerByExampleData(JobSeeker Jexample, boolean ascOrder, String ...props);
	public JobSeeker  findJobSeekerById(Integer id);
}

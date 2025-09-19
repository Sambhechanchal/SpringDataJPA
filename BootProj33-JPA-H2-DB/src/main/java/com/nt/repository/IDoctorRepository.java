package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {

}

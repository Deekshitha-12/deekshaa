package com.capgemini.dao;

import com.capgemini.model.Application;
import com.capgemini.model.Appointment;
import com.capgemini.model.Documents;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LicenseDao extends JpaRepository<Application,String>{
  
}

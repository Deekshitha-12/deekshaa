package com.capgemini.service;

import com.capgemini.model.Application;
import com.capgemini.model.DrivingLicense;
import com.capgemini.model.RTOOfficer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RTOOfficerServiceImpl implements RTOOfficerService{
	
  public String officeLogin(RTOOfficer rtoOfficer) {
    return null;
  }

  public List<Application> viewAllPendingApplications() {
    return null;
  }

  public List<Application> viewAllRejectedApplications() {
    return null;
  }

  public List<Application> viewAllApprovedApplications() {
    return null;
  }

  public Application viewApplicationById(String id) {
    return null;
  }

  public String checkChallanByVehicleNumber(String vehicleNumber) {
    return null;
  }

  public String checkAllChallan() {
    return null;
  }

  public Application modifyTestResultById(String testid) {
    return null;
  }

  public DrivingLicense generateLearnerLicense(String llnumber) {
    return null;
  }

  public DrivingLicense generateDrivingLicense(String dlnumber) {
    return null;
  }

  public String emailLicense(DrivingLicense drivingLicense) {
    return null;
  }
}

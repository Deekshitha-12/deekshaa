package com.capgemini.service;

import com.capgemini.model.Application;
import com.capgemini.model.DrivingLicense;
import com.capgemini.model.RTOOfficer;

import java.util.List;

public interface RTOOfficerService {
  String officeLogin(RTOOfficer rtoOfficer);
  List<Application> viewAllPendingApplications();
  List<Application> viewAllRejectedApplications();
  List<Application> viewAllApprovedApplications();
  Application viewApplicationById(String id);
  String checkChallanByVehicleNumber(String vehicleNumber);
  String checkAllChallan();
  Application modifyTestResultById(String testid);
  DrivingLicense generateLearnerLicense(String llnumber);
  DrivingLicense generateDrivingLicense(String dlnumber);
  String emailLicense(DrivingLicense drivingLicense);
}

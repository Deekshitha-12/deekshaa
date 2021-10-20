package com.capgemini.dao;

import com.capgemini.model.Application;
import com.capgemini.model.DrivingLicense;
import com.capgemini.model.RTOOfficer;

import java.util.List;

public interface RTOOfficerDao {
  String login(RTOOfficer rtoOfficer);
  List<Application> getAllPendingApplications();
  List<Application> getAllRejectedApplications();
  List<Application> getAllApprovedApplications();
  Application getApplicationById(String id);
  Application updateApplicationById(String id);
  DrivingLicense createLearnerLicense(String learnerLicense);
  DrivingLicense createDrivingLicense(String driversLicense);
}

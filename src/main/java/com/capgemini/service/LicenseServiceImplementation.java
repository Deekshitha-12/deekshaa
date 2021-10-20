package com.capgemini.service;

import com.capgemini.model.Application;
import com.capgemini.model.Appointment;
import com.capgemini.model.Documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseServiceImplementation implements LicenseService{


	public Application applyForLL(Application llApplication) {
    return llApplication;
  }

  public Application applyForDL(Application dlApplication) {
    return dlApplication;
  }

  public String uploadDocuments(Documents documents) {
    return null;
  }

  public String checkChallanByVehicleNumber(String challanVehicleNumber) {
    return null;
  }

  public String payChallanByVehicleNumber(String challanVehicleNumber) {
    return null;
  }

  public String payFees(int fee) {
    return null;
  }

  public String emailFeesReceipt(String receipt) {
    return null;
  }

  public String bookSlotLLTest(Appointment LLAppointment) {
    return null;
  }

  public String bookSlotDLTest(Appointment DLAppointment) {
    return null;
  }

  public List<Appointment> getAvailableSlots() {
    return null;
  }

  public Application renewLL(Application renewLL) {
    return null;
  }

  public Application renewDL(Application renewDL) {
    return null;
  }

  public String cancelAppointment(Appointment cancelAppointment) {
    return null;
  }
}

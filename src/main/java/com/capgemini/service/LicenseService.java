package com.capgemini.service;

import com.capgemini.model.Application;
import com.capgemini.model.Appointment;
import com.capgemini.model.Documents;

import java.util.List;

public interface LicenseService {
  Application applyForLL(Application llApplication);
  Application applyForDL(Application dlApplication);
  String uploadDocuments(Documents documents);
  String checkChallanByVehicleNumber(String challanVehicleNumber);
  String payChallanByVehicleNumber(String challanVehicleNumber);
  String payFees(int fee);
  String emailFeesReceipt(String receipt);
  String bookSlotLLTest(Appointment LLAppointment);
  String bookSlotDLTest(Appointment DLAppointment);
  List<Appointment> getAvailableSlots();
  Application renewLL(Application renewLL);
  Application renewDL(Application renewDL);
  String cancelAppointment(Appointment cancelAppointment);
}

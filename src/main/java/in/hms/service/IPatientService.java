package in.hms.service;

import java.util.List;

import in.hms.entity.Patient;

public interface IPatientService {

    Patient create(Patient patient);

    Patient findByEmail(String email);

    Patient findById(Long patientId);

    List<Patient> findAll();
}

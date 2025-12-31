package in.hms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hms.entity.Patient;
import in.hms.repository.PatientRepository;
import in.hms.service.IPatientService;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient findByEmail(String email) {
        return patientRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Patient findById(Long patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}

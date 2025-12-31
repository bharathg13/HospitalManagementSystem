package in.hms.service;

import in.hms.entity.Doctor;

public interface IDoctorService {

    Doctor create(Doctor doctor);

    Doctor findByEmail(String email);

    Doctor findById(Long doctorId);

    Doctor update(Doctor doctor);
}

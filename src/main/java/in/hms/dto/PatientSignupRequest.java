package in.hms.dto;

import lombok.Data;

@Data
public class PatientSignupRequest {
    private String patientName;
    private String email;
    private String password;
    private Integer age;
    private String gender;
    private String phone;
    private String address;
}

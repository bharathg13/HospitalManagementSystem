package in.hms.dto;

import lombok.Data;

@Data
public class DoctorSignupRequest {
    private String doctorName;
    private String specialization;
    private String email;
    private String password;
}

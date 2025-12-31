
package in.hms.dto;

import lombok.Data;

@Data
public class AdminSignupRequest {
    private String name;
    private String email;
    private String password;
}

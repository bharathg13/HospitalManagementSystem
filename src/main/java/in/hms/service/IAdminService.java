package in.hms.service;

import in.hms.entity.Admin;

public interface IAdminService {

    Admin create(Admin admin);

    Admin findByEmail(String email);

    Admin findById(Long adminId);
}

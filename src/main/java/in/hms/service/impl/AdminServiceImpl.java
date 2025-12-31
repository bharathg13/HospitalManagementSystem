package in.hms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hms.entity.Admin;
import in.hms.repository.AdminRepository;
import in.hms.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByEmail(String email) {
        return adminRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Admin findById(Long adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }
}


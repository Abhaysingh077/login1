package com.userprofile.Service;

import com.userprofile.Entity.Admin;
import com.userprofile.Entity.Users;
import com.userprofile.Repository.AdminRepo;
import com.userprofile.Repository.UserRepo;
import com.userprofile.Repository.UsersRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    
    @Autowired
    AdminRepo adminRepo;
    @Autowired
    UserRepo uploads;

//===============For Admins=================
    public void saveAdmin(Admin admin){
        adminRepo.save(admin);
    }

    public List<Admin> findAllAdmin() {
      return adminRepo.findAll();
    }
//    ==================For Uploading====================

public void savePhotos(Users photos) {
	uploads.save(photos);
	
}


}

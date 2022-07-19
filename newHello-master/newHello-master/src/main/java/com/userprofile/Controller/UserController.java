package com.userprofile.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.userprofile.Entity.Admin;
import com.userprofile.Entity.User;
import com.userprofile.Entity.Users;
import com.userprofile.Repository.AdminRepo;
import com.userprofile.Repository.UserRepo;
import com.userprofile.Service.MyService;
import com.userprofile.Service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	MyService myservice;
	

//================For Admin=====================

	@PostMapping("/admin")
	public void addAdmin(@RequestParam("file") MultipartFile file, @RequestParam(required = false)String description) {
		try {
			String filename = System.currentTimeMillis()+"_"+file.getOriginalFilename();
			
			file.getContentType();
			Admin admin= new Admin();
			admin.setImageUrl(ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/").path(filename).toUriString());
			admin.setProfilePhoto(file.getBytes());
		userService.saveAdmin(admin);}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@GetMapping("/admin")
	public List<Admin> findAdmin() {
		return userService.findAllAdmin();
	
	}
//    ====================For Upload photos=====================


	@PostMapping("/users")
    public UploadFileResponse addpost(
    		@RequestParam("file") MultipartFile file, @RequestParam(required = false)String description ) {

		try {
		String filename = System.currentTimeMillis()+"_"+file.getOriginalFilename();
		file.getContentType();
	    	Users user = new Users();

	    	user.setImageUrl(ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/").path(filename).toUriString());
	    	user.setImageData(file.getBytes());

	    	user.setDescription(description);
	    	user.setFileType(file.getContentType());
	    	user.setImageData(filename);
	    	userRepo.save(user);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

        return new UploadFileResponse("", "",
                file.getContentType(), file.getSize());
    }

	public String storeFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		return fileName;

	}

	@GetMapping("/users")
	public List<Users> getAllDetals() {
		return userRepo.findAll();
	}
	
	
	@GetMapping("/user")
	public List<User> getAll() {
		return myservice.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") int id) {
		return myservice.getUser(id);
	}
	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		return myservice.saveUsers(user);
	}
	
	@PutMapping("/userupdate")
	public User updateUser(@RequestBody User user) {
		return myservice.updateUser(user);
		
	}
	
	@PostMapping("/login")
	public List<User> GetUsersDetails(@RequestParam String email) {
		return myservice.loginByEmail(email);
	}
	

}


	


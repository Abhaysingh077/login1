package com.userprofile.Repository;


	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.userprofile.Entity.User;

	public interface UsersRepo  extends JpaRepository<User,Integer>{




		List<User> findDetailsByEmail(String email);

		

	}


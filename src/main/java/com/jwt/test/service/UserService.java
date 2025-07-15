package com.jwt.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.test.dto.UserDTO;
import com.jwt.test.model.User;
import com.jwt.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public ResponseEntity<?> createUser(UserDTO userDTO) {
		User user = new User(userDTO, passwordEncoder.encode(userDTO.getPassword()));
		repo.save(user);
		return ResponseEntity.ok("User added");
	}

}

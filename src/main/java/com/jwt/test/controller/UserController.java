package com.jwt.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.test.dto.UserDTO;
import com.jwt.test.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/public/user")
	public ResponseEntity<?> createUser(@RequestBody @Valid UserDTO userDTO) {
		return this.service.createUser(userDTO);
	}

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {
		return this.service.getAllUsers();
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		return this.service.deleteUser(id);
	}

}

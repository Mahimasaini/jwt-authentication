package com.jwt.test.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SecurityUser implements UserDetails {

	private static final long serialVersionUID = 1L;

	private Long userID;
	private String username;
	private String password;
	private String userUID;
	private Collection<? extends GrantedAuthority> authorities;

	public SecurityUser(String email, String password, List<SimpleGrantedAuthority> authorities) {
		this.username = email;
		this.password = password;
		this.authorities = authorities;
	}
}

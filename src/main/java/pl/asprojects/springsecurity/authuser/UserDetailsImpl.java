package pl.asprojects.springsecurity.authuser;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import pl.asprojects.springsecurity.entity.User;

public class UserDetailsImpl implements UserDetails{

	private String userName;
	private String password;
	private boolean isAdmin;
	private boolean expired;
	private boolean locked;
	private boolean enabled;
	
	public UserDetailsImpl(User user) {
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.isAdmin = user.isAdmin();
		this.expired = user.isExpired();
		this.locked = user.isLocked();
		this.enabled = user.isEnabled();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if(isAdmin) {
			return  Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
		} 
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return !this.expired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !this.locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

}

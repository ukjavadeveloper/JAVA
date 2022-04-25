package edu.institute.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("admin").password("admin123").roles("ADMIN").and()
		.withUser("hr").password("hr123").roles("HR").and()
		.withUser("student").password("stud123").roles("STUDENT");
	}
	// */admin/ -> befor admin any thing 
	//admin/* -> admin/home, admin/profile, admin/user/create
	// setting a user authorization details
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/hr/**").hasAnyRole("HR","ADMIN")//with admin login / admin can also access resources(manage) of hr
		.antMatchers("/student/**").hasAnyRole("STUDENT","HR","ADEMIN")//with hr and admin login/admin and hr can also access resources(manage) of student
		.and().formLogin();
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}		

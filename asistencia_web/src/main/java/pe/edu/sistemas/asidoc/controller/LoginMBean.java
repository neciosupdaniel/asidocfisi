package pe.edu.sistemas.asidoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.sistemas.asidoc.util.Enlaces;

@Controller
public class LoginMBean
{
	@RequestMapping( value = "/" )
	public String inicio()
	{
		return Enlaces.INICIO;
	}
	
	@RequestMapping( value = "/roles" )
	public String roles()
	{
		return Enlaces.ROLES;
	}
}

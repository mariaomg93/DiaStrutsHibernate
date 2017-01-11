package org.empleodigital.struts.Dia.actions;

import org.apache.commons.codec.digest.DigestUtils;
import org.empleodigital.struts.Dia.beans.UserBean;
import org.empleodigital.struts.Dia.controller.ControllerCliente;

import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action {
	
	private UserBean user;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String passNew=DigestUtils.md5Hex(user.getPassword());
		ControllerCliente.create(user.getNombre(), user.getUser(), passNew);
		return SUCCESS;
		
		
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	
	

}

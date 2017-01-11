package org.empleodigital.struts.Dia.actions;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.struts2.ServletActionContext;
import org.empleodigital.struts.Dia.beans.UserBean;
import org.empleodigital.struts.Dia.controller.ControllerCliente;
import org.empleodigital.struts.Dia.jpa.Cliente;

import com.opensymphony.xwork2.Action;

public class LoginAction  implements Action{
private UserBean user;
	public String execute() throws Exception {
		String passCod= DigestUtils.md5Hex(user.getPassword());
		Cliente cli= ControllerCliente.testUser(user.getUser(), passCod);
		if(cli !=null)
		{
			
			HttpSession seso= ServletActionContext.getRequest().getSession();
			seso.setAttribute("user", cli.getUser());
			seso.setAttribute("nombre", cli.getNombre());
			seso.setAttribute("id", cli.getId());
			return SUCCESS;			
		}
		else
		{
			return ERROR;

}
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
	
	

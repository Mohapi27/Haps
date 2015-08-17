/**
 * 
 */
package com.accenture.strutsmvc.actions;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.accenture.strutsmvc.controller.EmployeeCont;
import com.accenture.strutsmvc.model.Employee;

/**
 * @author m.s.mokoena
 *
 */
@org.apache.struts2.convention.annotation.Action(value = "HomePage", results = {
        @Result(name = "SUCCESS", location = "/addPage.jsp"),
        @Result(name = "ERROR", location = "/error.jsp") })
@Namespaces(value={ @Namespace("/User"),@Namespace("/")})
public class EmployeeAction {
	
	private String name;
	private String surname;
	private String occupation;
	private Employee emp;
	private EmployeeCont empCont;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String execute() throws Exception
	{
		String retValue = "";
		
		int retCode = 0;
		retCode = add();
		
		if(retCode ==0)
		{
			retValue = "SUCCESS";
		}
		else{
			retValue = "ERROR";
		}
		return retValue;
	}
	
	private int add()
	{
		System.out.println("We are now trying to add");
		int retCode = 0;
		try{
			emp.setName(name);
			emp.setOccupation(occupation);
			emp.setSurname(surname);
			
			String value =empCont.addEmployee(emp);
			if(value.equals("SUCCESS"))
			{
			retCode = 0;
			}
			else{
				retCode = 1;
			}
		}
		catch(Exception ex)
		{
			retCode=-1;
		}
		return retCode;
	}
public EmployeeAction()
{
	emp = new Employee();
	empCont = new EmployeeCont();
}
}

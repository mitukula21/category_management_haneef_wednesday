package com.capg.categorymanagement.service;

import com.capg.categorymanagement.bean.Bean;
import com.capg.categorymanagement.dao.DaoClass;

public class ServiceClass implements ServiceInterface
{
	DaoClass dao= new DaoClass();
	public void takeDetails() throws ClassNotFoundException 
	{
		 dao.takeDetails();
	}
   
	public boolean createCategory(String cat)
	{
	
	   boolean b= dao.createCategory(cat);
	   return b;
		
	}

	public void editCategory() 
	{
		dao.editCategory();
	}

	public void deleteCategory()
	{
		// TODO Auto-generated method stub
		dao.deleteCategory();
		
		
	}
	
    public boolean emailpattern(Bean bean)
   {
    	
    	boolean emailcheck = false;
		String emailpattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email = bean.getAdmin_email();
		if (email.matches(emailpattern)) 
		{
			emailcheck = true;
		}
		else
		{
			System.out.println("Email pattern is wrong");
		}
		return emailcheck;
   }	
    	
	
	
	
	
   
    public boolean passwordpattern(Bean bean) {
    	boolean passwordcheckflag = false;
		if (bean.getAdmin_password().matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})"))
		{
			passwordcheckflag = true;
		} 
		else 
		{
			System.out.println("Enter the password correctly");
			passwordcheckflag = false;
		}
		return passwordcheckflag;
	}

	@Override
	public boolean emailcheck(Bean bean) {
		// TODO Auto-generated method stub
		boolean em=dao.admin_email(bean);
		return em;
	}

	@Override
	public boolean passwordcheck(Bean bean) {
		// TODO Auto-generated method stub
		boolean ps=dao.admin_password(bean);
		return ps;
	}

    
	
}
	


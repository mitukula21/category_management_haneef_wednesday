package com.capg.categorymanagement.dao;

import com.capg.categorymanagement.bean.Bean;

public interface DaoInterface 
{
   public void takeDetails() throws ClassNotFoundException;
   boolean createCategory(String cat);
   void editCategory();
   public boolean admin_email(Bean bean);
   public boolean admin_password(Bean bean);
 
}

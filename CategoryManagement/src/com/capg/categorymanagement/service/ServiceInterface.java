package com.capg.categorymanagement.service;

import com.capg.categorymanagement.bean.Bean;

public interface ServiceInterface 
{
     void takeDetails() throws ClassNotFoundException;
     boolean createCategory(String cat);
     void editCategory();
     void deleteCategory();
     public boolean emailpattern(Bean bean);
     public boolean passwordpattern(Bean bean);
     public boolean emailcheck(Bean bean);
     public boolean passwordcheck(Bean bean);
}

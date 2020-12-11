package com.week2.main.question4;

import java.util.List;

public class AddressManager {
public User user;


 public static List<String> adressInsert(User user,String address){
	
	 user.stringList.add(address);
	 return user.stringList;
 }
 
 public static List<String> adressRemove(User user,String address){
	
	 user.stringList.remove(address);
	 return user.stringList;
	
 }

}

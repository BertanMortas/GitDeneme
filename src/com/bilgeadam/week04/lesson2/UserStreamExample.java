package com.bilgeadam.week04.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserStreamExample {

	public static void main(String[] args) 
	{
		
		List<User> users = new ArrayList<>();
		

		users.add(new User(1,"Aleyna"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));
        
        // stream foreach userları konsola yaz
//        users.stream().
//        forEach(user -> System.out.println(user));
	
        // her kullanıcıdan önce java 8 yazsın
        
//        users.stream().
//        forEach(user ->{System.out.println(user);
//        	System.out.println("java8 ");
//        });
        
//        users.stream().forEach(user-> user.talk());
        
        // method referans
//        users.stream().forEach(User::talk);
        
        // user id si 5 ten büyükleri bulalım 
        //kaç adet olduğunu konsola yazdıralım
	
	
//	long x =
//        users.stream().filter(user-> user.id>5)
//        .count();
//	System.out.println(x);
	
		// collect seçip başka listeye kaydetme
//        
//      List<User> filteredlist=  users.stream()
//        .filter(user->user.id>5)
//        .collect(Collectors.toList());
//        
//      filteredlist.stream().forEach(user->System.out.println(user));
	

        // collect with map
        
        List<User> mapedlist= users.stream().map(user -> new User(user.id+100,user.name))
        .collect(Collectors.toList());
        mapedlist.stream().forEach(user -> System.out.println(user));
        
        
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

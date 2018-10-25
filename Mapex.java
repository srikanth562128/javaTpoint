package org.collection;
import java.util.*;
public class Mapex {
public static void main(String[] args) {
	Map<Integer, AccDetails> map=new HashMap<Integer,AccDetails>();
	AccDetails a = new AccDetails("vinay","5000");
	AccDetails a1 = new AccDetails("vinay1","6000");
	AccDetails a2 = new AccDetails("vinay2","7000");
	AccDetails a3 = new AccDetails("vinay3","8000");
	AccDetails a4 = new AccDetails("vinay4","9000");
	map.put(501,a); 	map.put(502,a1);	map.put(503,a2);	map.put(504,a3);
	map.put(505,a4);
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the account no");
	int x=ob.nextInt();
	int flag=0;
        for(Map.Entry<Integer, AccDetails> entry:map.entrySet())
    {   
    	if(entry.getKey()==x)
    	{
        flag=1;
    	System.out.println(entry.getKey()+"  "+entry.getValue());
    	    	}  }
        if(flag==0)
        {
        	System.out.println("Invalid Account no");
        }
}}

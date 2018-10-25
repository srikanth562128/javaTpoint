package org.collection;
public class AccDetails 
{
 	String name,accbal;
	public AccDetails( String name, String accbal) {
		super();
				this.name = name;		this.accbal = accbal;
	}
	@Override
	public String toString() {
		return "AccDetails [name=" + name + ", accbal=" + accbal + "]";
	}    }

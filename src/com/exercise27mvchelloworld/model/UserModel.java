package com.exercise27mvchelloworld.model;

public class UserModel 
{
	private byte edad=0;
	private String nombre="";
	private int id=0;
	
	public byte getEdad() 
	{
		return this.edad;
	}
	
	public void setEdad(byte edad)
	{
		this.edad=edad;
	}
	
	
	public String getNombre() 
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	
	public int getId() 
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public String toString()
	{
		String datos;
		datos= "El nombre es: "+this.nombre+" La edad es: "+this.edad+ "  el id es: "+this.id;
		return datos;
	}

}

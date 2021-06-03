package application;

import javafx.beans.property.*;

public class Nombre 
{
	private DoubleProperty num;
	
	public final double getNombre()
	{
		if(num !=null)
			return num.get();
		return 0;
	}
	
	public final void setNombre(double number)
	{
		this.nombrePropery().set(number);
	}
	
	public final DoubleProperty nombrePropery()
	{
		if(num==null)
			num=new SimpleDoubleProperty(0);
		return num;
	}

}

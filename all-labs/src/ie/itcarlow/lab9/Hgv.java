package ie.itcarlow.lab9;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				02/12/2021

public class Hgv extends RoadVehicle implements ImportDuty
{
	private int cargo;
	private double hgvPrice;

	//contructor empty
	public Hgv()
	{ 	
		this(0, 0, 0, 0.0);	
	}
	
	//constructor overloaded
	public Hgv(int c, int w, int p, double v)
	{ 
		super(w, p);			//invoke parent constructor
		setCargo(c);
		setPrice(v);
	}

	//setters & getters
	public void setCargo(int size)
	{
		cargo = size;
	}
	public int getCargo()
	{
		return cargo;
	}
	public void setPrice(double value)
	{
		hgvPrice = value;
	}
	public double getPrice() 
	{
		return hgvPrice;
	}
	
	//interface method
	public double calculateDuty()
	{
		return HGVTAXRATE * hgvPrice;
	}	
}

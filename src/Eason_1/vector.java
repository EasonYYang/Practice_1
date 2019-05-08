package Eason_1;

public class vector extends Coordinate{

	public vector(double x, double y, double z,String name) {
		super(x, y, z,name);
		// TODO Auto-generated constructor stub
	}

	public double get_the_angle(vector this,vector B) 
	{
		double angle;
		angle=this.inner_product(B)/(this.get_the_norm()*B.get_the_norm());
		angle=Math.acos(angle);
		return angle;
	}
	
	public double get_the_norm(vector this) 
	{
		double Norm;
		Norm=Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2);
		Norm=Math.sqrt(Norm);
		return Norm;
	} 
	
	public double inner_product(vector this,vector B) 
	{
		double Innerprod;
		Innerprod=this.x*B.x+this.y*B.y+this.z*B.z;
		return Innerprod;
	} 
	
	public void print(vector this) 
	{
		System.out.print("The vector "+this.name+" equals: ("+this.x+","+this.y+","+this.z+").\n");
	}
}

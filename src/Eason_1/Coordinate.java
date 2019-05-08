package Eason_1;
import Eason_1.vector;
public class Coordinate {
	double x,y,z;
	String name;
	public Coordinate(double x,double y,double z,String name) 
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.name=name;
	}
	public void print(Coordinate this) 
	{
		System.out.print("The position of "+this.name+" is:("+this.x+","+this.y+","+this.z+").\n");
	}
	
	public vector get_the_vector(Coordinate this,Coordinate B) 
	{
		vector diff= new vector(B.x-this.x, B.y-this.y, B.z-this.z,this.name+B.name);
		//diff.x=B.x-this.x;diff.y=B.y-this.y;diff.z=B.z-this.z;
		//diff.name=this.name+B.name;
		return diff;
	}
	
	public double getDistance(Coordinate this, Coordinate B) 
	{
		double Dist;
		//vector delta=new vector();
		vector delta=this.get_the_vector(B);
		Dist=delta.get_the_norm();
		return Dist;
	}
}
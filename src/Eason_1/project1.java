package Eason_1;
import Eason_1.Coordinate;
import Eason_1.vector;
public class project1 {
	public static void main(String[] args) {
		double[][] raw_data={{0,0,0},{3,4,5},{-5,-12,0}};
		String[] label= {"A","B","C"};
		int len=raw_data.length;
		Coordinate[] Point=new Coordinate[len];
		for(int i=0;i<len;i++) {
			Point[i]=new Coordinate(raw_data[i][0],raw_data[i][1],raw_data[i][2],label[i]);
		}	//Initialization	
		/*
		Coordinate Point2=new Coordinate();
		Coordinate Point3=new Coordinate();
		Point[0].x=0;Point[0].y=0;Point[0].z=0;Point[0].name="A";
		Point[1].x=3;Point[1].y=4;Point[1].z=12;Point[1].name="B";
		Point[2].x=-5;Point[2].y=-12;Point[2].z=0;Point[2].name="C";
		*/
		double[] dist=new double[2];
		for(int i=0;i<len;i++) Point[i].print();
		dist[0]= Point[0].getDistance(Point[1]);
		vector vector_01=Point[0].get_the_vector(Point[1]);
		vector_01.print();
		System.out.println("DistanceAB="+dist[0]);
		dist[1]= Point[0].getDistance(Point[2]);
		vector vector_02=Point[0].get_the_vector(Point[2]);
		vector_02.print();
		System.out.println("DistanceAC="+dist[1]);
		double angle=vector_01.get_the_angle(vector_02);
		System.out.println("The angle between AB and AC is:"+angle);
	}
}
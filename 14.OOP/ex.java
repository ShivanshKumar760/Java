class car
{
	int car_num;
	String car_name;
	static int car_door;

}
public class ex 
{
	public static void main(String[] args) {
		car s1= new car();
		s1.car_num=7;
		s1.car_name="alto";
		s1.car_door=4;
		System.out.println(s1.car_num);
		System.out.println(s1.car_name);
		System.out.println(s1.car_door);
		car s2= new car();
		s2.car_num=5;
		
		System.out.println(s2.car_num);
		System.out.println(s2.car_name);
		System.out.println(s2.car_door);


	}
}
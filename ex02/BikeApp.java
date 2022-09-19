package day01.ex02;

public class BikeApp {
	public static void main(String[] args) {
		Steel steel = new Steel();
		Bike<Steel> sBike = new Bike<Steel>();
		sBike.setMaterial(steel);
		Steel s = sBike.getMaterial();
		System.out.println(s);
		System.out.println(sBike);
		System.out.println("===============");
		
		Carbon carbon = new Carbon();
		Bike<Carbon> cBike = new Bike<Carbon>();
		cBike.setMaterial(carbon);
		Carbon c = cBike.getMaterial();
		System.out.println(c);
		System.out.println(cBike);
		System.out.println("===============");
		
		Aluminum aluminum = new Aluminum();
		Bike<Aluminum> aBike = new Bike<Aluminum>();
		aBike.setMaterial(aluminum);
		Aluminum a = aBike.getMaterial();
		System.out.println(a);
		System.out.println(aBike);
		System.out.println("===============");
	}
}

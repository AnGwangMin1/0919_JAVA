package day01.ex01;

public class Atest {
	public static void main(String[] args) {
		A<String> a1 = new A<String>();
		A<Integer> a2 = new A<Integer>();
		A<Character> a3 = new A<Character>();
		A<Double> a4 = new A<Double>();
		a1.set("홍길동");
		String aa1= a1.get();
		
		a2.set(5555);
		int aa2=a2.get();
		
		a3.set('C');
		char aa3=a3.get();
		
		a4.set(55.55);
		double aa4=a4.get();
		
		System.out.println(aa1);
	}
}

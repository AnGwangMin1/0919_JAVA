package day01.ex01;

public class CupTest {
	public static void main(String[] args) {
		Milk milk = new Milk();
		
		Cup<Milk> mCup = new Cup<Milk>();
		mCup.set(milk);
		mCup.hold();
	}
}

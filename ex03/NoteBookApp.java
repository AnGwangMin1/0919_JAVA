package day01.ex03;

public class NoteBookApp {
	public static void main(String[] args) {
		NoteBook<String, String> notebook = new NoteBook<String, String>();
		NoteBook<String, Integer> notebook2 = new NoteBook<String, Integer>();
		NoteBook<String, Double> notebook3 = new NoteBook<String, Double>();
		
		notebook.setBrand("Samsung");
		notebook.setVersion("갤럭시 북 프로");
		
		notebook2.setBrand("엘지 그램");
		notebook2.setVersion(2022);
		
		notebook3.setBrand("레노버 ThinkPad X1");
		notebook3.setVersion(10.1);
		
		System.out.println("제조사"+notebook.getBrand()
		+", 버전: "+notebook.getVersion());
		System.out.println("제조사"+notebook2.getBrand()
		+", 버전: "+notebook2.getVersion());
		System.out.println("제조사"+notebook3.getBrand()
		+", 버전: "+notebook3.getVersion());
		
	}
}

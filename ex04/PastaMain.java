package day01.ex04;

public class PastaMain {
	public static void main(String[] args) {
		Cream cream = new Cream();
		Garlic garlic = new Garlic();
		Shiremp shiremp = new Shiremp();
		Tomato tomato = new Tomato();
		System.out.println(Math.random());
		Bon bon = new Bon();
		Pasta<Tomato,Shiremp> sPasta = new Pasta<Tomato,Shiremp>();
		sPasta.setSource(tomato);
		sPasta.setIngredient(shiremp);
		System.out.println(sPasta.toString());
		
		Pasta<Garlic,Shiremp> gPasta = new Pasta<Garlic,Shiremp>();
		gPasta.setSource(garlic);
		gPasta.setIngredient(shiremp);
		System.out.println(gPasta.toString());
		
		Pasta<Cream,Shiremp> cPasta = new Pasta<Cream,Shiremp>();
		cPasta.setSource(cream);
		cPasta.setIngredient(shiremp);
		System.out.println(cPasta.toString());
		
		Pasta<Garlic,Bon> gbPasta = new Pasta<Garlic,Bon>();
		gbPasta.setSource(garlic);
		gbPasta.setIngredient(bon);
		System.out.println(gbPasta.toString());
	}

}

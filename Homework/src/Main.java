

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin Demirog", "Java");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setName("Emirhan Unal");
		instructor2.setCourse("C#");
		
		
		
		 Category category1 = new Category();
		 category1.setId(1);
		 category1.setName("Egitim: "+ instructor1.getCourse());
		 
		 Category category2 = new Category();
		 category2.setId(1);
		 category2.setName("Egitmen: " + instructor1.getName());
		 
		 System.out.println(category1.getName());
		 System.out.println(category2.getName());
		 
		 

	}

}


abstract class Question{

	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	   public void print() {
		   String desc = null;
		   desc="apple?";
	      System.out.println(desc);
	   }      
	
}

   class Composite extends Question{

	public Composite(String desc) {
		super(desc);
		
	}

	public static void main(String[] args) {

	}
	
}
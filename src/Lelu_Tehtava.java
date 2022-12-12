
public class Lelu_Tehtava {

	public static void main(String[] args) {
		
		Lelu Lelu1 = new Lelu();
		Lelu Vieteri = new Vieterilelu();
		Lelu1.Print();
		
		Vieteri.Print();
		
		
	}

}  //End of Main

	class Lelu{
		
		String Nimi = "Automobiili";
		int Paino = 1;
		
		
		public void Print() {
			
			System.out.println("Lelun nimi on " + Nimi + " ja se painaa " + Paino + "kg");
			
			
		}
		} //Lelu ends
	
	class Vieterilelu extends Lelu {
		
	
		private boolean Viritetty;
		private int Nopeus;
		private int Kiihdyta;
		
		public Vieterilelu() {
		

			Viritetty = false;
			Nopeus = 0;
			Kiihdyta = 0;
			}
		
		public void Viritetty() {
			if (Viritetty == true) {
			System.out.println("Automobiili on viritetty"); 
			Nopeus++;
			}
			
			else {
				System.out.println("Automobiilia ei ole viritetty");
			}
		}
		
		public void Kiihdyta(int Kiihdyta) {
			if (Viritetty == true) {
			Kiihdyta = Nopeus +1; }
			
		}
		
		public void Nopeus(int Nopeus) {
			Kiihdyta(Nopeus);
			System.out.println("Automobiilin vauhti on " + Nopeus);
		}
		@Override
		public void Print() {
			Viritetty();
			Nopeus(Nopeus);
			
			
		}

		
	} //VieteriLelu ends
	

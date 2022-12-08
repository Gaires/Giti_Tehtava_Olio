
public class Lelu_Tehtava {

	public static void main(String[] args) {
		
		//Lelu Lelu1 = new Lelu();
		Lelu VieteriLelu = new VieteriLelu();
		//Lelu1.Print();
		VieteriLelu.Print();
		
	}

}  //End of Main

	class Lelu{
		
		String Nimi = "Automobiili";
		int Paino = 1;
		
		
		public void Print() {
			
			System.out.println("Lelun nimi on " + Nimi + " ja se painaa " + Paino + "kg");
			
			
		}
		} //Lelu ends
	
	class VieteriLelu extends Lelu {
		
	
		private boolean Viritetty;
		private int Nopeus;
		private int Kiihdyta;
		
		public VieteriLelu() {
		
			String Nimi = "Automobiili";
			int Paino = 1;
			Viritetty = true;
			Nopeus = 0;
			Kiihdyta = 0;
			
		}
		
		public void Kiihdyta(int Kiihdyta) {
			Kiihdyta = Nopeus +1;
			
		}
		
		public void Nopeus(int Nopeus) {
			
			System.out.println("Auton vauhti " + Nopeus);
		}
		public void Print() {
			
			System.out.println(Nopeus);
			System.out.println("TESTI");
		}

		
	} //VieteriLelu ends
	

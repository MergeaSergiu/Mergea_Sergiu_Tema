
public class DevTeam extends Echipa{
		
		public DevTeam(String Nume, int AniExperienta) {
			super(Nume,AniExperienta);
		}
		
		
		public double getCost() {
		 
			double totalCosturi = 0;	
			totalCosturi = 2500 + lider.getAniExperienta()*250;
			for(int i = 0 ;i < membriLista.size();i++) {
					
				if( membriLista.get(i).getAniExperienta() < 2 ) totalCosturi = totalCosturi +1500;
				else {
					if(membriLista.get(i).getAniExperienta() >= 2 && membriLista.get(i).getAniExperienta() <= 5) totalCosturi = totalCosturi + 1500 + 0.25 *1500; 
					else {
					totalCosturi = totalCosturi + 1500 + 0.5 *1500;
			
				}
			}
		
	
		}
		
return totalCosturi;

		}
		
	}


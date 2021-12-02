
public class HR extends Echipa{

	public HR(String Nume, int maximMembri) {
		super(Nume,maximMembri);
	}
	
	public double getCost() {
		double totalCosturi =0;
		totalCosturi = 1350 + lider.getAniExperienta()*300;
		for(int  i = 0 ;i < membriLista.size();i++) {
			if( membriLista.get(i).getAniExperienta() < 2 ) totalCosturi = totalCosturi +1000;
			else {
				if(membriLista.get(i).getAniExperienta() >= 2 && membriLista.get(i).getAniExperienta() <= 5) totalCosturi = totalCosturi + 1000 + 0.25 *1000; 
				else {
				totalCosturi = totalCosturi + 1000 + 0.5 *1000;
		
			}
		}
		
		}
		
	return totalCosturi;	
	}
}

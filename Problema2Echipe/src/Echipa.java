import java.util.ArrayList;
import java.util.Scanner;

class Membru{
	
	private String Nume;
	private String Prenume;
	private int varsta;
	private int salariu;
	private int AniExperienta;
	public Membru(String Nume, String Prenume, int varsta, int salariu, int AniExperienta) {
		this.Nume =Nume;
		this.Prenume = Prenume;
		this.varsta = varsta;
		this.salariu = salariu;
		this.AniExperienta = AniExperienta;
	}
	public int getAniExperienta() {
		return this.AniExperienta;
	}
	
	public String getNume() {
		return this.Nume;
	}
	
	public String getPrenume() {
		return this.Prenume;
	}
	
	public boolean equals(Object O) {
		  if(this == O) {
			  return true;
		  }
		  if(O == null || this.getClass()!= O.getClass() ) {
			  return false;
		  }
		  
		  Membru aux = (Membru)O;
		  return this.Nume.equals(aux.Nume) && this.Prenume.equals(aux.Prenume) ;
		  
	  }
	@Override
	public String toString() {
		return "Membru [Nume=" + Nume + ", Prenume=" + Prenume + ", varsta=" + varsta + ", salariu=" + salariu
				+ ", AniExperienta=" + AniExperienta + "]";
	}
	
	
	

}

abstract public class Echipa {
	
  private String Nume;
  private int maximMembri;
  Membru lider;
  protected ArrayList<Membru> membriLista = new ArrayList<Membru>();
  
  Scanner scan = new Scanner(System.in);
  
  public Echipa(String Nume, int maximMembri) {
	  this.Nume = Nume;
	  this.maximMembri = maximMembri;
  }
  
  public boolean addMember(Membru member) {
	  if(membriLista.size() > maximMembri) return false;
	  else {
		  membriLista.add(member);
		  return true;
		  
	  }
  }
  
  public boolean SetLeader(Membru liderNou) {
	  if(liderNou.getAniExperienta()>=5) {
		  lider = liderNou;
		  return true;
	  }
	  else {
		  return false;
	  }
	  									
  }
  
  Membru RemoveMember(Membru member) {
	  Membru remove = null; 
	  for(int i =0 ; i< membriLista.size();i++ ) {
		  	if( member.equals(membriLista.get(i)) == true ) {
			  remove = membriLista.get(i);
			  membriLista.remove(i);
			  break; 
	  }
	}

return remove;
  
  }
  
  public String toString() {
	  String aux ="Lider echipa:<"+lider.getNume()+"-"+lider.getPrenume()+">\n";
	  for(int i =0 ; i< membriLista.size();i++) {
		  aux= aux + membriLista.get(i)+"\n";
		  
	  }
  return aux;
  
  }
  
  abstract public double getCost();
 
  public void SetNrMembrisiNume(Membru member) {
	  if( member.equals(lider) == true) {
		  this.Nume = scan.nextLine();
		  this.maximMembri = scan.nextInt();
	  }
	  else {
		  System.out.println("Mmebru nu este lider, nu poate efectua schimbarea");
	  }
  
  }
  

}



import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Echipa Dev, Hr;
		Dev = new DevTeam("Echipa Dev",6);
		Hr = new HR("Echipa HR",6);
		Membru membru1,membru2,membru3;
		membru1 = new Membru("Mergea","Sergiu",20,2500,6);
		//System.out.println(membru1.getNume());
		//System.out.println(membru1.getPrenume());
		//System.out.println(membru1.getAniExperienta());
		membru2 = new Membru("Mergea","Mihai",16,2300,3);
		membru3 = new Membru("Barbu","Dacian",21,3000,8);
		Dev.SetLeader(membru1);
		Hr.SetLeader(membru2);
		//System.out.println(Hr.lider.getNume());
		
		Hr.SetLeader(membru3);
		//System.out.println(Hr.lider.getNume());
	   
		Membru membru4 = new Membru("Belcea","Vlad",20,1900,4);
		Membru membru5 = new Membru("Pegu","Bogdan",20,2300,2);
		Membru membru6 = new Membru("Blistyar","Bogdan",22,2500,3);
		Membru membru7 = new Membru("Borchescu","Darius",18,2100,1);
		Membru membru8 = new Membru("Neagoe","Dan",20,2300,2);
		Membru membru9 = new Membru("Basa","Adrian",18,1700,2);
		Membru membru10 = new Membru("Foghis", "Silvia",20,2200,5);
		Membru membru11 = new Membru("Urecheatu","Natalia",18,2300,1);
		Membru membru12 = new Membru("Ploscaru","Carla",20,2000,3);
		
		
		Dev.addMember(membru2);
		Dev.addMember(membru4);
		Dev.addMember(membru5);
		Dev.addMember(membru6);
		Dev.addMember(membru11);
		System.out.println(Dev.toString());
		
		
		Hr.addMember(membru7);
		Hr.addMember(membru8);
		Hr.addMember(membru9);
		Hr.addMember(membru10);
		Hr.addMember(membru12);
		System.out.println(Hr.toString());
		
		System.out.println(Dev.getCost()+"\n");
		System.out.println(Hr.getCost()+"\n");
		
		System.out.println("Membrul eliminat:");
		System.out.println(Dev.RemoveMember(membru4));//elimina membrul
		System.out.println(Dev.toString()); //afiseaza lista
		System.out.println(Dev.getCost()+"\n"); //afiseaza costul
		
		System.out.println("Membrul eliminat:");
		System.out.println(Hr.RemoveMember(membru10)); //elimina membrul
		System.out.println(Hr.toString());// afiseaza lista
		System.out.println(Hr.getCost()+"\n"); // afiseaza costul
		
		
		
		
		
		
	}

}

package fcfs;


public class Scheduler {




	public static void main(String[] args ) {	
		String[] processo= new String[4];
		int []tArrivo=new int [4];
		int []tEsecuzione=new int [4];
		int []tServizio=new int [4];
		int []tAttesa=new int [4];
		double media;

		processo[0]="P0";
		processo[1]="P1";
		processo[2]="P2";
		processo[3]="P3";

		tArrivo[0]=0;
		tArrivo[1]=1;
		tArrivo[2]=2;
		tArrivo[3]=3;
		
	
		tEsecuzione[0]=5;
		tEsecuzione[1]=3;
		tEsecuzione[2]=8;
		tEsecuzione[3]=6;
		for(int i=0; i<tArrivo.length; i++) {
			System.out.println(tArrivo[i]);
		}
	}
}

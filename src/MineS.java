public class MineS {
	public static void main(String[] args) {

		System.out.println("Unesi dimenzije matrice: ");
		int velicina = TextIO.getlnInt();

		int[][] matrica = dvodimenzionalniNiz(velicina);
		ispisMatricu(matrica);

		int poc = 0;
		int kraj = velicina;
		getRandom(poc, kraj);

		raporediMine(matrica);
		ispisMatricu(matrica);

		popuniBrojeve(matrica);
		ispisMatricu(matrica);
		
		praznaMarica ( matrica);
		ispisMatricu(matrica);
		
		unosOdKorisnika(matrica);
		
		
	}
private static int [][] unosOdKorisnika(int[][] matrica) {
	    int brojMina = (int) (matrica.length * matrica.length * 0.3);
	    int brojac=1; 
		
		while ( brojac <= (matrica.length * matrica.length) - brojMina ) {
			
			System.out.println("Unesi koordintu x: ");
			int x= TextIO.getlnInt();
			System.out.println("Unesi koordintu y: ");
			int y= TextIO.getlnInt();
	
					
					brojac++;
					if ( matrica [x][y] == -1){
						System.out.println("Ovo je kraj igre!");
				    }
					if ( matrica [x][y] >= 1){
						continue;
				    }
					if ( matrica [x][y] >= 0){
						continue;
				    }
					if ((matrica.length * matrica.length) - brojMina == brojac) {
						
					}
					//System.out.println(matrica [i][j] );
					ispisMatricu(matrica);
			}
		    
		}
		
	
	
	private static int [][] praznaMarica(int[][] matrica) {
		for ( int i =0;  i < matrica.length;  i++) {
			for ( int j =0;  j < matrica[i].length;  j++) {
				matrica[i][j] = -3;
			}
		}
		return matrica;
	}


	private static int[][] popuniBrojeve(int[][] matrica) {
	//	int x = matrica.length - 1;

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (matrica[i][j] == -1) {

					int pocI = i - 1;
					int krajI = pocI + 2;
					int pocJ = j - 1;
					int krajJ = pocJ + 2;

					if (pocI < 0) {
						pocI = 0;
					}

					if (krajI >= matrica.length) {
						krajI = matrica.length - 1;
					}
					if (pocJ < 0) {
						pocJ = 0;
					}
					if (krajJ >= matrica.length) {
						krajJ = matrica.length - 1;
					}

					for (int k = pocI; k <= krajI; k++) {
						for (int m = pocJ; m <= krajJ; m++) {

							if (matrica[k][m] != -1) {
								matrica[k][m]++;
							}
						}
					}

				}
			}
		}

		return matrica;

	}

	private static int[][] raporediMine(int[][] matrica) {

		int brojMina = (int) (matrica.length * matrica.length * 0.3);
		int mina = -1;

		while (brojMina > 0) {
			int x = getRandom(0, matrica.length - 1);
			int y = getRandom(0, matrica.length - 1);

			if (matrica[x][y] == mina) {
				continue;
			} else {
				matrica[x][y] = mina;
				brojMina--;
			}

		}
		return matrica;
	}

	private static int[][] dvodimenzionalniNiz(int x) {
		int[][] matrica = new int[x][x];
		return matrica;
	}

	public static void ispisMatricu(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrica[0].length; j++) {
				if (matrica[i][j]== -3){
					 System.out.print("   |"); 
				 } else {
					 System.out.printf("%2d |", matrica[i][j]);
				 }
			}
			System.out.println();
		}
		//System.out.println();

	}

	public static int getRandom(int poc, int kraj) {
		int randomBr = (int) (poc + Math.random() * (kraj - poc));
		return randomBr;

	}
	
	
	
}

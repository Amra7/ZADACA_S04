public class Matrica {

	public static void main(String[] args) {
		System.out.println("Unesi dimenzije matrice: ");
		int visina = TextIO.getlnInt();
		int sirina = TextIO.getlnInt();

		int[][] matrica = kreirajMatricu(visina, sirina);
		ispisiMatricu(matrica);
		// popuniMatricu(matrica);
		popuniMatricuKrace(matrica);

		System.out.println("Suma matrice je: ");
		int[][] sumaMatrice = sabiranjeMatrice(matrica);
		ispisiMatricu(sumaMatrice);

		System.out.println("Razlika matrice je: ");
		int[][] razlikaMatrice = oduzimanjeMatrice(matrica);
		ispisiMatricu(razlikaMatrice);

		System.out.println("Proizvod matrice je: ");
		int[][] proizvodMatrice = mnozenjeMatrice(matrica);
		ispisiMatricu(proizvodMatrice);

	}

	/**
	 * Funkcija koja popunjava matricu.
	 * 
	 * @param matrica
	 *            ciji su svi elmenti =0 prije unosa novih prijednosti.
	 * @return vraca matricu sa vrijednostima koje smo unijeli u matricu.
	 */
	private static int[][] popuniMatricuKrace(int[][] matrica) {
		System.out.println("Unesi vrijednosti u matricu: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = TextIO.getlnInt();
			}
		}
		return matrica;
	}

	/**
	 * Funkcija koja mnozi matricu.
	 * 
	 * @param matrica
	 *            dvodimenzionalni niz koji u sebi sadrzi razlicite vrijednosti.
	 * @return proizvod matrice.
	 */
	private static int[][] mnozenjeMatrice(int[][] matrica) {
		int[][] proizvodMatrice = new int[matrica.length][matrica.length];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				proizvodMatrice[i][j] = matrica[i][j] * matrica[j][i];

			}
		}
		return proizvodMatrice;
	}

	/**
	 * Fukcija koja vrsi oduzimanje matrice.
	 * 
	 * @param matrica
	 *            dvodimenzionalni niz koji u sebi sadrzi razlicite vrijednosti.
	 * @return razliku matrice.
	 */
	private static int[][] oduzimanjeMatrice(int[][] matrica) {
		int[][] rezlikaMatrice = new int[matrica.length][matrica.length];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				rezlikaMatrice[i][j] = matrica[i][j] - matrica[i][j];
			}
		}
		return rezlikaMatrice;
	}

	/**
	 * Funkcija koja vrsi sabiranje matrica.
	 * 
	 * @param matrica
	 *            dvodimenzionalni niz koji u sebi sadrzi razlicite vrijednosti.
	 * @return sumu matrice.
	 */
	private static int[][] sabiranjeMatrice(int[][] matrica) {
		int[][] sumMatrica = new int[matrica.length][matrica.length];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				sumMatrica[i][j] = matrica[i][j] + matrica[i][j];
			}
		}
		return sumMatrica;
	}

	// private static int [][] popuniMatricu(int[][] matrica) {
	// int x =0;
	// int y = 0;
	//
	// do {
	// System.out.println("Unesi koordinatu x: ");
	// x = TextIO.getlnInt();
	// while ( x <0 || x >= matrica.length){
	// System.out.println(" Unesi validnu kooordinatu!");
	// x = TextIO.getlnInt();
	// }
	// System.out.println("Unesi koordinatu y: ");
	// y = TextIO.getlnInt();
	// while ( y <0 || y >= matrica.length){
	// System.out.println(" Unesi validnu kooordinatu!");
	// y = TextIO.getlnInt();
	// }
	// System.out.println("Unesi vrijednost koju zelis postaviti: ");
	// int vrijednost =TextIO.getlnInt() ;
	// matrica[x][y] = vrijednost;
	// ispisiMatricu(matrica);
	//
	// } while ( matrica [x][y] != 0);
	//
	// return matrica;
	// }

	/**
	 * Funkcija koja kreira matricu na osnovu vrijednosti koje smo unijeli.
	 * 
	 * @param velicina
	 *            broj redova u matrici.
	 * @param sirina
	 *            broj kolona u matrici.
	 * @return vraca matricu u zadanim vrijednostima.
	 */
	public static int[][] kreirajMatricu(int velicina, int sirina) {
		int[][] matrica = new int[velicina][sirina];
		return matrica;

	}

	/**
	 * Funkcija koja ispisuje matricu.
	 * 
	 * @param matrica
	 *            matrica dvodimenzionalni niz.
	 */
	public static void ispisiMatricu(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.printf(" %2d", matrica[i][j]);
			}
			System.out.println();
		}
	}
}

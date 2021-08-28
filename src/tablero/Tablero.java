package tablero;
public abstract class   Tablero  {

	public   void main(String[] args) {
		Peon peonBlanco = new Peon();
		peonBlanco.setPeonBlanca("Peon Blanco");

		Peon peonNegro = new Peon();
		peonNegro.setPeonNegra("Peon Negro");

		Torre torreBlanca = new Torre();
		torreBlanca.setTorreBlanca("Torre Blanco");

		Torre torreNegra = new Torre();
		torreNegra.setTorreNegra("Torre negro");

		Caballo caballoBlanco = new Caballo();
		caballoBlanco.setCaballoBlanca("Caballo Blanco");

		Caballo caballoNegro = new Caballo();
		caballoNegro.setCaballoNegro("caballo negro");

		Alfil alfilBlanco = new Alfil();
		alfilBlanco.setAlfilBlanca("alfil blanco");
		
		Alfil alfilNegro = new Alfil();
		alfilNegro.setAlfilNegra("alfil negro");		

		Reina reinaBlanca = new Reina();
		reinaBlanca.setReinaBlanca("reina blanca ");

		Reina reinaNegra = new Reina();
		reinaNegra.setReinaNegra("Reina negra");

		ReyB reyBlanco = new ReyB();
		reyBlanco.setReyBlanca("rey blanco");

		ReyB reyNegro = new ReyB();
		reyNegro.setReyNegra("REY NEGRO");
		
        Tablero  tablero[][]= new Tablero[8][8];
		tablero [0][4] = reinaBlanca; 
		tablero [7][4]= reinaNegra;
		

		
	
	}

	}

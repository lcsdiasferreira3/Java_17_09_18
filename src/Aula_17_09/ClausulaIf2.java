package Aula_17_09;

public class ClausulaIf2 {

	public static void main(String[] args) {
		int idade = 100;
		if( idade <= 12 ) {
			System.out.println( "Criança" );
		}
		else if( idade <= 19 ) {
			System.out.println( "Adolescente" );
		}
		else if( idade <= 60 ) {
			System.out.println( "Adulto" );
		}
		else {
			System.out.println( "Idoso" );
		}
	}

}

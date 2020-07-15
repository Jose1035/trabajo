
package suma_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Suma_1 {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System. in );
		String digitado = "";

		System.out.println("Digita un texto aleatorio");
		digitado = in.nextLine();

		digitado = digitado.trim();

		String comaDigitado = "";
		String[] arrSplit = digitado.split("\\s+");
		for (int i = 0; i < arrSplit.length; i++) {
			comaDigitado += arrSplit[i] + ",";
		}

		String[] arrDigitado = comaDigitado.split(",");
		List < String > arrListDigitado = new ArrayList < String > ();
		arrListDigitado = Arrays.asList(arrDigitado);
		int suma = 0;
		for (String strDigitado: arrListDigitado) {
			char[] strDigitado_div = strDigitado.toCharArray();
			String numDigitado = "";
			int tempSuma = 0;
			for (int i = 0; i < strDigitado_div.length; i++) {
				if (Character.isLetter(strDigitado_div[i])) {
					System.out.println("'" + strDigitado_div[i] + "'" + " no es un numero");
				} else if (Character.isDigit(strDigitado_div[i])) {
					numDigitado += strDigitado_div[i];
					tempSuma = Integer.parseInt(numDigitado);

				}
			}
			suma += tempSuma;
		}
		System.out.println("La suma de la cadena es: " + suma);
	}
}
      
    
    


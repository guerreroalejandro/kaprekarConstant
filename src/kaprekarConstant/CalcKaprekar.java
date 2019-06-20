package kaprekarConstant;

import java.util.Arrays;

public class CalcKaprekar {
	
	public static int calcularKaprekar (int numeroCal) {
		int [] arrResult = new int [4];
		int x = 3;
		String numOrder = "";
		String numOrderInv = "";
		String numero;
			
		for (int i=0; i<4; i++) {
			
			arrResult[i] = Integer.parseInt(Integer.toString(numeroCal).substring(i, i+1));
		}
		
		Arrays.sort(arrResult);
		
		for (int i=0; i<4; i++) {
			numOrder = numOrder.concat(Integer.toString(arrResult[i]));
			numOrderInv = numOrderInv.concat(Integer.toString(arrResult[x]));
			x--;
		}		
	
		return Integer.parseInt(numOrderInv) - Integer.parseInt(numOrder);
	}
}

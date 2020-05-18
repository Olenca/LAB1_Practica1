package lab1_prac1_problema1;
import java.util.*;
public class LAB1_Prac1_problema1 {
    public static void main(String[] args) {
      String[] cadena = {"aba", 
                        "aa",
                        "ad",
                        "vcd",
                        "aba"};
       	int mayor = 0,aux=0;
	for (int i=0; i<cadena.length; i++){
            if (cadena[i].length() >mayor){
                aux=cadena[i].length();
		mayor = aux;
	    }
        }
	ArrayList<String> resp = new ArrayList();
	for (int i=0; i<cadena.length; i++){
	    if (cadena[i].length() >= aux){
		resp.add(cadena[i]);
	    }
	}
        System.out.println(resp);
    } 
}
   
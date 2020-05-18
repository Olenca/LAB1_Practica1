package lab1_prac1_problema4; 
public class LAB1_Prac1_problema4 {
    public static void main(String[] args) {
       String cadena="aabb";
       System.out.println(problema4(cadena));          
    }
    public static boolean problema4(String cadena){
        int C=cadena.length();
        boolean u = false;
	for (int i=0; i<C; i++){
            int cont=0;
	    for (int j=0; j<C; j++){
                if(cadena.charAt(j) == cadena.charAt(i)){
		    cont += 1;
		}
	    }
	    if (cont%2 == 1){
                if (u==true ){
		    return false;
	        }else{
                  char  d = cadena.charAt(i);
                  u = true;
		 }
	    }
	}
        return true;
    }    
}

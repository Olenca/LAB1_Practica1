package lab1_pract1_problema2;
public class LAB1_Pract1_problema2 {
    public static void main(String[] args) {
       String cadena = "(rab)";
       System.out.println(problema2(cadena));  
    }
   public static String problema2(String cadena){
      // int C=cadena.length();
        for(int i=0; i<cadena.length(); i++){
            if(cadena.toCharArray()[i] == ')') {
                cadena = cadena.substring(0, i) + cadena.substring(i+1);
                i--;
                String invertido = "";
                while(cadena.toCharArray()[i] != '(') {
                    invertido += cadena.toCharArray()[i];
                    cadena = cadena.substring(0, i) + cadena.substring(i + 1);
                    i --;
                }
                cadena = cadena.substring(0, i) + invertido + cadena.substring(i + 1);
                i += invertido.length() - 1;
            }
        }
        return cadena;
    } 
}

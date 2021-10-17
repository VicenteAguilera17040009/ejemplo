/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.chat_encriptado;

/**
 *
 * @author zneo1
 */

public class CifradoCesar {
    
    public CifradoCesar()
    {
        
    }
    
     public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
         
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') 
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                else 
                    cifrado.append((char) (texto.charAt(i) + codigo));
              
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') 
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                else 
                    cifrado.append((char) (texto.charAt(i) + codigo));
            }
                else
                cifrado.append((char) (texto.charAt(i)));
            
                
            
        }
        return cifrado.toString();
    
}
      public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') 
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                 else 
                    cifrado.append((char) (texto.charAt(i) - codigo));
       
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A')
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                else 
                    cifrado.append((char) (texto.charAt(i) - codigo));  
            }
             else
                cifrado.append((char) (texto.charAt(i)));
        }
        return cifrado.toString();
    }
}

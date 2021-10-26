package ejemplo.chat_encriptado.cifradocesar;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CodificacionXOR
{
    private static String cod ="secreto";
    //método para cifrar el texto
    public static String cifradoxor(String texto) {
        StringBuilder cifrado = new StringBuilder();

        return cifrado.toString();
    }

    //método para descifrar el texto
    public static byte[] XOR(String texto)
    {
        int textoL = texto.length();
        int codigoL = cod.length();
        String codigoN="";
        //System.out.println(texto);
           int pos=0;
           for (int i=0;i<textoL;i++)
           {
               if(codigoN.length()==textoL)
                   break;
               else
               {
                   codigoN += cod.charAt(pos);
                   pos++;
                   if(pos==codigoL)
                   {
                       pos=0;
                   }
                   //System.out.println(codigoN);
               }
           }

           byte letras[] = texto.getBytes();
           byte letrasc[] = codigoN.getBytes();
           byte res[] = new byte[letras.length];
           for(int i=0;i<letras.length;i++) {
               res[i] = (byte) (letras[i] ^ letrasc[i]);
               //System.out.println(res[i]);
           }
        return res;
    }
}

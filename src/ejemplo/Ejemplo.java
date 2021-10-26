/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import ejemplo.chat_encriptado.cifradocesar.CifradoCesar;

/**
 *
 * @author zneo1
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String val= CifradoCesar.cifradoCesar("hola QUE HACES", 5);
        System.out.println(val);
        System.out.println(CifradoCesar.descifradoCesar(val, 5));
    }
    
}

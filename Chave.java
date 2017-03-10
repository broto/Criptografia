/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.util.Random;

/**
 *
 * @author Anacláudia
 */
public class Chave {

    public long gerarChave(String strTamanho) {
        long num = 0;
        int tamanho = Integer.parseInt(strTamanho);
        switch (tamanho) {
            case 6:
                num = 100000;
                break;
            case 7:
                num = 1000000;
                break;
            case 8:
                num = 10000000;
                break;
            case 9:
                num = 100000000;
                break;
            case 10:
                num = 1000000000;
                break;
            case 11:
                num = 10000000000l;
                break;
            default:
                return -1;
        }
        //long i = (long) (1000000000000l + Math.random() * 8999999999999l);
        Random gerador = new Random();
        //new Long (String.valueOf (new Random().nextLong()).substirng (6))
        long chave = gerador.nextInt(900) + num; //siempre 3 digitos

        //int dig5 = gerador.nextInt(90000) + 10000; //siempre 5 digitos
        //long dig13 = gerador.nextLong(9000000000000L) + 1000000000000L; //siempre 13 digitos
        return chave;
    }
}

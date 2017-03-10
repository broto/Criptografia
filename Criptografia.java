/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

/**
 *
 * @author Anacláudia
 */
public class Criptografia {

    long chave = 0;
    long tamanho = 0;

    public Criptografia(long chave, int tamanho) {
        long num = 0;
        switch (tamanho) {
            case 6:
                num = 999999;
                break;
            case 7:
                num = 9999999;
                break;
            case 8:
                num = 99999999;
                break;
            case 9:
                num = 999999999;
                break;
            case 10:
                num = 9999999999l;
                break;
            case 11:
                num = 99999999999l;
                break;
            default:
                num = 0;
        }

        this.chave = chave;
        this.tamanho = num;

    }

    public long decifrarChave() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= tamanho; i++) {
            System.out.println(i);
            if (i == chave) {
                System.out.println("Achei! A chave secreta é " + i);
                break;
            } else {
                continue;
            }
        }
        long tempo = System.currentTimeMillis() - start;
        return tempo;
    }
}

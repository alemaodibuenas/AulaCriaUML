package com.mycompany.atividadearraylist;

import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import com.mycompany.atividadearraylist.Pojo.*;
import java.util.Scanner;

/**
 *
 * @author Giovanni Pratto
 */
public class Principal {
    public static void main(String[] args) {
        
        ImprimirPojo imprimir = new ImprimirPojo();
        imprimir.imprimiCategoria();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual SubCategoria deseja ver:");
        int n = sc.nextInt();
        imprimir.imprimitSubCategoria(n);
        System.out.println("Qual Produto deseja ver:");
        n = sc.nextInt();
        imprimir.imprimitProduto(n);
    }        
}

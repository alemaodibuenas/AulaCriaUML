package com.mycompany.atividadearraylist.Pojo;

import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import java.util.ArrayList;

/**
 *
 * @author Giovanni Pratto
 */
public class ImprimirPojo {

    public void imprimiCategoria() {
        EstoqueFakeDB.getCategorias().stream()
                .filter(lambda -> (lambda.getCategoriaID() > 0) && (lambda.getCategoriaID() <= 3))
                .forEach(cat -> {
                    System.out.println(cat.getCategoriaID());
                    System.out.println(cat.getDescricao());
                    System.out.println(cat.getDataInsert());
                });
    }
    
    public void imprimitSubCategoria(int sub){
        EstoqueFakeDB.getSubCategorias().stream()
                .filter(lambda -> lambda.getCategoriaID() == sub)
                .forEach(s -> {
                    System.out.println(s.getSubCategoriaID());
                    System.out.println(s.getCategoriaID());
                    System.out.println(s.getDescricao());
                });
    }
    
    public void imprimitProduto(int pro){
        EstoqueFakeDB.getProdutos().stream()
                .filter(lambda -> lambda.getSubCategoriaID() == pro)
                .forEach(p -> {
                    System.out.println(p.getProdutoID());
                    System.out.println(p.getDescricao());                    
                });
    }

}

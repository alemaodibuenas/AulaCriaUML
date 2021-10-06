package com.mycompany.atividadearraylist.FakeDB;

import com.mycompany.atividadearraylist.Pojo.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Giovanni Pratto
 */
public final class EstoqueFakeDB {
    
    private static ArrayList<CategoriaPojo> categorias;
    
    public static ArrayList<CategoriaPojo> getCategorias(){
        //Design Pattern SingleTon
        if(categorias == null){
            categorias = new ArrayList();
        }
        return categorias;
    }
    
    private static void inicializarCategoria(){
        Date dataInsert = new Date(System.currentTimeMillis());
        
    }
    
    private static void inicializarSubCategoriaPojo(){
        for (CategoriaPojo item : categorias) {
            Date dataInsert = new Date(System.currentTimeMillis());
            if(item.getCategoriaID() == 1){
                adicionarSubCategoria(item, 0, descricao, dataInsert);
            }
            if(item.getCategoriaID() == 2){
                adicionarSubCategoria(item, 0, descricao, dataInsert);
                
            }
            if(item.getCategoriaID() == 3){
                
            }
        }        
    }
    
    private static void adicionarCategoria(int id, String descricao, Date dataInsert){
        CategoriaPojo categoriaPojo = new CategoriaPojo();
        categoriaPojo.setCategoria(id);
        categoriaPojo.setDescricao(descricao);
        categoriaPojo.setDataInsert(dataInsert);
        categorias.add(categoriaPojo);
    }
    
    private static void adicionarSubCategoria(CategoriaPojo categoriaPojo, int id, String descricao, Date dataInsert){
        SubCategoriaPojo subCategoriaPojo = new SubCategoriaPojo();
        subCategoriaPojo.setSubCategoriaID(id);
        subCategoriaPojo.setCategoriaID(categoriaPojo.getCategoria());
        subCategoriaPojo.setDescricao(descricao);
        subCategoriaPojo.setDataInsert(dataInsert);
        categoriaPojo.getSubCategorias().add(subCategoriaPojo);
    }
    
    private static void adicionarProduto(SubCategoriaPojo subCategoriaPojo, int id, String descricao, Date dataInsert){
        ProdutoPojo produtoPojo = new ProdutoPojo();
        produtoPojo.setProdutoID(id);
        produtoPojo.setSubCategoriaID(subCategoriaPojo.getSubCategoriaID());
        produtoPojo.setCategoriaID(subCategoriaPojo.getCategoriaID());
        produtoPojo.setDescricao(descricao);
        produtoPojo.setDataInsert(dataInsert);
        subCategoriaPojo.getProdutos().add(produtoPojo);
    }
    
}

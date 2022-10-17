package Config;

import java.util.Comparator;

import Produtos.Produto;

public class OrdenadorPorNome implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2) {
        // TODO Auto-generated method stub
        return produto1.getNome().compareTo(produto2.getNome());
    }
    
}

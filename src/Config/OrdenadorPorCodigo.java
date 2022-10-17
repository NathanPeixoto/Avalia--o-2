package Config;

import java.util.Comparator;

import Produtos.Produto;

public class OrdenadorPorCodigo implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2) {
        // TODO Auto-generated method stub
        return Integer.compare(Integer.parseInt(produto1.getCodigo()), Integer.parseInt(produto2.getCodigo()));
    }
    
}

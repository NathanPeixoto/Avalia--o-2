package Config;

import java.util.Comparator;

import Produtos.Produto;

public class OrdenadorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2) {
        // TODO Auto-generated method stub

        return Double.compare(produto1.getValor(),produto2.getValor());
    }
    
}

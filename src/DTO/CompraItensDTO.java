package DTO;

/**
 *
 * @author Pri
 */
public class CompraItensDTO {

    /**
     * Método Compra Itens, contem os atributos que serao as informacoes das
     * entradas/compras dos produtos.
     */
    
    // Atributos
    private int idCompraItens;
    private CompraDTO compra;
    private ProdutoDTO produto;
    private int compraQnt;
    private int compraPreco;
     private int compraSubtotal;
    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    public int getIdCompraItens() {
        return idCompraItens;
    }

    public void setIdCompraItens(int idCompraItens) {
        this.idCompraItens = idCompraItens;
    }

    public CompraDTO getCompra() {
        return compra;
    }

    public void setCompra(CompraDTO compra) {
        this.compra = compra;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public int getCompraQnt() {
        return compraQnt;
    }

    public void setCompraQnt(int compraQnt) {
        this.compraQnt = compraQnt;
    }

    public int getCompraPreco() {
        return compraPreco;
    }

    public void setCompraPreco(int compraPreco) {
        this.compraPreco = compraPreco;
    }

    public int getCompraSubtotal() {
        return compraSubtotal;
    }

    public void setCompraSubtotal(int compraSubtotal) {
        this.compraSubtotal = compraSubtotal;
    }


  


}

package DTO;

/**
 *
 * @author Pri
 */
public class CompraDTO {

    /**
     * Método Compra, contem os atributos que serao as informacoes das
     * entradas/compras dos produtos.
     */
    
    // Atributos
    private int idCompra;
    private String dataCompra;
    private FornecedorDTO fornecedor;
    private ProdutoDTO produto;
    private int compraQnt;
    private int compraPreco;
    private int compraPrecoVenda;
    private int compraValorTotal;

    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public FornecedorDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorDTO fornecedor) {
        this.fornecedor = fornecedor;
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

    public int getCompraPrecoVenda() {
        return compraPrecoVenda;
    }

    public void setCompraPrecoVenda(int compraPrecoVenda) {
        this.compraPrecoVenda = compraPrecoVenda;
    }

    public int getCompraValorTotal() {
        return compraValorTotal;
    }

    public void setCompraValorTotal(int compraValorTotal) {
        this.compraValorTotal = compraValorTotal;
    }



}

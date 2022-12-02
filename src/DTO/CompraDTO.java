
package DTO;

public class CompraDTO 
{
    private int idCompra;
    private String dataCompra;

    private FornecedorDTO fornecedor;
    private ProdutoDTO produto;

    private double compraPreco;
    private double compraPrecoVenda;
    private double compraValorTotal;

    private String compraValidade;

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

    public double getCompraPreco() {
        return compraPreco;
    }

    public void setCompraPreco(double compraPreco) {
        this.compraPreco = compraPreco;
    }

    public double getCompraPrecoVenda() {
        return compraPrecoVenda;
    }

    public void setCompraPrecoVenda(double compraPrecoVenda) {
        this.compraPrecoVenda = compraPrecoVenda;
    }

    public double getCompraValorTotal() {
        return compraValorTotal;
    }

    public void setCompraValorTotal(double compraValorTotal) {
        this.compraValorTotal = compraValorTotal;
    }

    public String getCompraValidade() {
        return compraValidade;
    }

    public void setCompraValidade(String compraValidade) {
        this.compraValidade = compraValidade;
    }
    
    
    
}

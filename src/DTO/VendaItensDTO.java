
package DTO;

/**
 *
 * @author Pri
 */
public class VendaItensDTO {
        /**
     * Método Venda Itens, contem os atributos que serao as informacoes das
     * saidas/vendas dos produtos.
     */
    
    
    //Atributos tbl_Venda_itens
    private int idVendaItens;
    private VendasDTO venda;
    private ProdutoDTO produto;
    private CompraDTO compra;
    private int qntVenda;
    private int subtotalVenda;
    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
  
    public int getIdVendaItens() {
        return idVendaItens;
    }

    public void setIdVendaItens(int idVendaItens) {
        this.idVendaItens = idVendaItens;
    }

    public VendasDTO getVenda() {
        return venda;
    }

    public void setVenda(VendasDTO venda) {
        this.venda = venda;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public CompraDTO getCompra() {
        return compra;
    }

    public void setCompra(CompraDTO compra) {
        this.compra = compra;
    }

    public int getQntVenda() {
        return qntVenda;
    }

    public void setQntVenda(int qntVenda) {
        this.qntVenda = qntVenda;
    }

    public int getSubtotalVenda() {
        return subtotalVenda;
    }

    public void setSubtotalVenda(int subtotalVenda) {
        this.subtotalVenda = subtotalVenda;
    }

  

    
    
    
}

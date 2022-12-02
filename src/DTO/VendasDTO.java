package DTO;

import java.util.Date;

/**
 *
 * @author Pri
 */
public class VendasDTO {

    /**
     * Método Venda, contem os atributos que serao as informacoes das
     * saidas/vendas dos produtos.
     */
    
    // Atributos
    private int idVenda;
    private Date dataVenda;
    private int numNota;
    private ProdutoDTO produto;
    private CompraDTO compra;
    private int qntVenda;
    private double valorProd;
    private double descontoVenda;
    private double totalVenda;

    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getDescontoVenda() {
        return descontoVenda;
    }

    public void setDescontoVenda(double descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    public void setDataVenda(String datamysql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        this.numNota = numNota;
    }

}

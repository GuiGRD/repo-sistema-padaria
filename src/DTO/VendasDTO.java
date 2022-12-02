
package DTO;


import java.util.Date;



public class VendasDTO 
{

    private int idVenda;
    private Date dataVenda; // no banco esta como DATE
    private ClienteDTO cliente;
    private ProdutoDTO produto;
    private CompraDTO compra;
    private int qntVenda;
    private double valorProd;
    private double descontoVenda;
    private double totalVenda; //txtValorTotal
    
    

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

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
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
    

   
}
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


    public int getCompraValorTotal() {
        return compraValorTotal;
    }

    public void setCompraValorTotal(int compraValorTotal) {
        this.compraValorTotal = compraValorTotal;
    }



}

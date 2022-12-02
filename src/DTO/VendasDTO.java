package DTO;


/**
 *
 * @author Pri
 */
public class VendasDTO {

    /**
     * Método Venda, contem os atributos que serao as informacoes das
     * saidas/vendas dos produtos.
     */
    
    // Atributos tbl_Venda
    private int idVenda;
    private String dataVenda;
    private int totalVenda;
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


    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(int totalVenda) {
        this.totalVenda = totalVenda;
    }
    
     /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */


}


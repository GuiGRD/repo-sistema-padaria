
package DTO;

/**
 *
 * @author Pri
 */

public class ProdutoDTO 
{    
    /**
     * Método Produto, contem os atributos que serao as informacoes dos
     * produtos que serao cadastrados para serem vendidos no sistema padaria
     */
    
    //Atributos
    private int idProduto;
    private int codbarraProduto;
    private String nomeProduto;
    private int estoqueProduto;
    private FornecedorDTO Fornecedor;
    
    
     /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCodbarraProduto() {
        return codbarraProduto;
    }

    public void setCodbarraProduto(int codbarraProduto) {
        this.codbarraProduto = codbarraProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public FornecedorDTO getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(FornecedorDTO Fornecedor) {
        this.Fornecedor = Fornecedor;
    }



}

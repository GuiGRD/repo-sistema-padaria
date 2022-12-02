
package DTO;



public class ProdutoDTO 

{
    private int idProduto;
    private int codbarraProduto;
    private String nomeProduto;
    private int estoqueProduto;


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

}

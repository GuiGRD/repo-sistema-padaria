package DTO;

import java.util.Vector;

/**
 *
 * @author Pri
 */

public class FornecedorDTO {

    /**
     * Método Fornecedor, contem os atributos que serao as informacoes de quem
     * ira fornecer os produtos para o sistema padaria.
     */
    
    
    // Atributos
    private int idFornecedor;
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String celularFornecedor;
    private String cepFornecedor;
    private String ruaFornecedor;
    private int numeroFornecedor;
    private String bairroFornecedor;
    private String cidadeFornecedor;
    private String estadoFornecedor;

    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    
    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        this.celularFornecedor = celularFornecedor;
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        this.cepFornecedor = cepFornecedor;
    }

    public String getRuaFornecedor() {
        return ruaFornecedor;
    }

    public void setRuaFornecedor(String ruaFornecedor) {
        this.ruaFornecedor = ruaFornecedor;
    }

    public int getNumeroFornecedor() {
        return numeroFornecedor;
    }

    public void setNumeroFornecedor(int numeroFornecedor) {
        this.numeroFornecedor = numeroFornecedor;
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        this.bairroFornecedor = bairroFornecedor;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public String getEstadoFornecedor() {
        return estadoFornecedor;
    }

    public void setEstadoFornecedor(String estadoFornecedor) {
        this.estadoFornecedor = estadoFornecedor;
    }

    public void setIdFornecedor(FornecedorDTO fdto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

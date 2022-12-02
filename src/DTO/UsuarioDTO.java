package DTO;

import DTO.FuncionarioDTO;

/**
 *
 * @author Pri
 */

    /**
     * Método Usuário, contem os atributos que serao as informacoes que
     * definirao quem tera acesso ao sistema
     */
public class UsuarioDTO {


    
    
    // Atributos
    private int idUsuario;
    private FuncionarioDTO funcionario;
    private String loginUsuario;
    private String senhaUsuario;
    private String perfilUsuario;

    /**
     * Métodos Getters e Setters utilizados para padronizacao do gerenciamento
     * sobre os atributos informados.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public FuncionarioDTO getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioDTO funcionario) {
        this.funcionario = funcionario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(String perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

}

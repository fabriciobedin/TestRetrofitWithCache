package io.github.fabriciobedin.testretrofitwithcache.model;

/**
 * Created by fabricio on 07/02/2017.
 */

public class UfModel {
    private Integer ufCodigo;
    private String ufDescricao;
    private String ufSigla;
    private PaisModel pasCodigo;

    public UfModel(Integer ufCodigo, String ufDescricao, String ufSigla, PaisModel pasCodigo) {
        this.ufCodigo = ufCodigo;
        this.ufDescricao = ufDescricao;
        this.ufSigla = ufSigla;
        this.pasCodigo = pasCodigo;
    }

    public UfModel() {
    }

    public Integer getUfCodigo() {
        return ufCodigo;
    }

    public void setUfCodigo(Integer ufCodigo) {
        this.ufCodigo = ufCodigo;
    }

    public String getUfDescricao() {
        return ufDescricao;
    }

    public void setUfDescricao(String ufDescricao) {
        this.ufDescricao = ufDescricao;
    }

    public String getUfSigla() {
        return ufSigla;
    }

    public void setUfSigla(String ufSigla) {
        this.ufSigla = ufSigla;
    }

    public PaisModel getPasCodigo() {
        return pasCodigo;
    }

    public void setPasCodigo(PaisModel pasCodigo) {
        this.pasCodigo = pasCodigo;
    }

    @Override
    public String toString() {
        return "UfModel{" +
                "ufCodigo=" + ufCodigo +
                ", ufDescricao='" + ufDescricao + '\'' +
                ", ufSigla='" + ufSigla + '\'' +
                ", pasCodigo=" + pasCodigo +
                '}';
    }
}

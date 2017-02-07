package io.github.fabriciobedin.testretrofitwithcache.model;

/**
 * Created by fabricio on 07/02/2017.
 */

public class PaisModel {
    private Integer pasCodigo;
    private String pasDescricao;
    private String pasSigla;

    public PaisModel(Integer pasCodigo, String pasDescricao, String pasSigla) {
        this.pasCodigo = pasCodigo;
        this.pasDescricao = pasDescricao;
        this.pasSigla = pasSigla;
    }

    public PaisModel() {
    }

    public Integer getPasCodigo() {
        return pasCodigo;
    }

    public void setPasCodigo(Integer pasCodigo) {
        this.pasCodigo = pasCodigo;
    }

    public String getPasDescricao() {
        return pasDescricao;
    }

    public void setPasDescricao(String pasDescricao) {
        this.pasDescricao = pasDescricao;
    }

    public String getPasSigla() {
        return pasSigla;
    }

    public void setPasSigla(String pasSigla) {
        this.pasSigla = pasSigla;
    }

    @Override
    public String toString() {
        return "PaisModel{" +
                "pasCodigo=" + pasCodigo +
                ", pasDescricao='" + pasDescricao + '\'' +
                ", pasSigla='" + pasSigla + '\'' +
                '}';
    }

}

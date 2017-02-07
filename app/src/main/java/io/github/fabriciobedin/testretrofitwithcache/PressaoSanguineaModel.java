package io.github.fabriciobedin.testretrofitwithcache;

import java.util.Date;

/**
 * Created by fabricio on 07/02/2017.
 */

public class PressaoSanguineaModel {
    private Integer psaCodigo;
    private Date psaDatahorareg;
    private Date psaDatahoraevento;
    private Integer psaValordiastolica;
    private Integer psaValorsistolica;
    private String psaObservacao;
    private PessoaModel pesCodigo;

    public PressaoSanguineaModel(Integer psaCodigo, Date psaDatahorareg, Date psaDatahoraevento, Integer psaValordiastolica, Integer psaValorsistolica, String psaObservacao, PessoaModel pesCodigo) {
        this.psaCodigo = psaCodigo;
        this.psaDatahorareg = psaDatahorareg;
        this.psaDatahoraevento = psaDatahoraevento;
        this.psaValordiastolica = psaValordiastolica;
        this.psaValorsistolica = psaValorsistolica;
        this.psaObservacao = psaObservacao;
        this.pesCodigo = pesCodigo;
    }

    public PressaoSanguineaModel() {
    }

    public Integer getPsaCodigo() {
        return psaCodigo;
    }

    public void setPsaCodigo(Integer psaCodigo) {
        this.psaCodigo = psaCodigo;
    }

    public Date getPsaDatahorareg() {
        return psaDatahorareg;
    }

    public void setPsaDatahorareg(Date psaDatahorareg) {
        this.psaDatahorareg = psaDatahorareg;
    }

    public Date getPsaDatahoraevento() {
        return psaDatahoraevento;
    }

    public void setPsaDatahoraevento(Date psaDatahoraevento) {
        this.psaDatahoraevento = psaDatahoraevento;
    }

    public Integer getPsaValordiastolica() {
        return psaValordiastolica;
    }

    public void setPsaValordiastolica(Integer psaValordiastolica) {
        this.psaValordiastolica = psaValordiastolica;
    }

    public Integer getPsaValorsistolica() {
        return psaValorsistolica;
    }

    public void setPsaValorsistolica(Integer psaValorsistolica) {
        this.psaValorsistolica = psaValorsistolica;
    }

    public String getPsaObservacao() {
        return psaObservacao;
    }

    public void setPsaObservacao(String psaObservacao) {
        this.psaObservacao = psaObservacao;
    }

    public PessoaModel getPesCodigo() {
        return pesCodigo;
    }

    public void setPesCodigo(PessoaModel pesCodigo) {
        this.pesCodigo = pesCodigo;
    }

    @Override
    public String toString() {
        return "PressaoSanguineaModel{" +
                "psaCodigo=" + psaCodigo +
                ", psaDatahorareg=" + psaDatahorareg +
                ", psaDatahoraevento=" + psaDatahoraevento +
                ", psaValordiastolica=" + psaValordiastolica +
                ", psaValorsistolica=" + psaValorsistolica +
                ", psaObservacao='" + psaObservacao + '\'' +
                ", pesCodigo=" + pesCodigo +
                '}';
    }
}

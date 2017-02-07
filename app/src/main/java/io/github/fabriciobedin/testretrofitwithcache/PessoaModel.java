package io.github.fabriciobedin.testretrofitwithcache;

import java.util.Date;

/**
 * Created by fabricio on 07/02/2017.
 */

public class PessoaModel {
    private Integer pesCodigo;
    private String pesNome;
    private Date pesDatanascimento;
    private String pesSenha;
    private String pesEnumsexo;
    private String pesNacionalidade;
    private String pesLogradouro;
    private Integer pesNumero;
    private String pesComplemento;
    private String pesBairro;
    private String pesEmail;
    private String pesFonecelular;
    private Boolean pesAceitotermosuso;
    private Date pesDatahorareg;
    private boolean pesFaztratamentopressaoalta;
    private boolean pesEfumante;
    private String pesProfissionalregistro;
    private CidadeModel cidCodigo;

    public PessoaModel(Integer pesCodigo, String pesNome, Date pesDatanascimento,
                       String pesSenha, String pesEnumsexo, String pesNacionalidade,
                       String pesLogradouro, Integer pesNumero, String pesComplemento,
                       String pesBairro, String pesEmail, String pesFonecelular,
                       Boolean pesAceitotermosuso, Date pesDatahorareg,
                       boolean pesFaztratamentopressaoalta, boolean pesEfumante,
                       String pesProfissionalregistro, CidadeModel cidCodigo) {
        this.pesCodigo = pesCodigo;
        this.pesNome = pesNome;
        this.pesDatanascimento = pesDatanascimento;
        this.pesSenha = pesSenha;
        this.pesEnumsexo = pesEnumsexo;
        this.pesNacionalidade = pesNacionalidade;
        this.pesLogradouro = pesLogradouro;
        this.pesNumero = pesNumero;
        this.pesComplemento = pesComplemento;
        this.pesBairro = pesBairro;
        this.pesEmail = pesEmail;
        this.pesFonecelular = pesFonecelular;
        this.pesAceitotermosuso = pesAceitotermosuso;
        this.pesDatahorareg = pesDatahorareg;
        this.pesFaztratamentopressaoalta = pesFaztratamentopressaoalta;
        this.pesEfumante = pesEfumante;
        this.pesProfissionalregistro = pesProfissionalregistro;
        this.cidCodigo = cidCodigo;
    }

    public PessoaModel() {
    }

    public Integer getPesCodigo() {
        return pesCodigo;
    }

    public void setPesCodigo(Integer pesCodigo) {
        this.pesCodigo = pesCodigo;
    }

    public String getPesNome() {
        return pesNome;
    }

    public void setPesNome(String pesNome) {
        this.pesNome = pesNome;
    }

    public Date getPesDatanascimento() {
        return pesDatanascimento;
    }

    public void setPesDatanascimento(Date pesDatanascimento) {
        this.pesDatanascimento = pesDatanascimento;
    }

    public String getPesSenha() {
        return pesSenha;
    }

    public void setPesSenha(String pesSenha) {
        this.pesSenha = pesSenha;
    }

    public String getPesEnumsexo() {
        return pesEnumsexo;
    }

    public void setPesEnumsexo(String pesEnumsexo) {
        this.pesEnumsexo = pesEnumsexo;
    }

    public String getPesNacionalidade() {
        return pesNacionalidade;
    }

    public void setPesNacionalidade(String pesNacionalidade) {
        this.pesNacionalidade = pesNacionalidade;
    }

    public String getPesLogradouro() {
        return pesLogradouro;
    }

    public void setPesLogradouro(String pesLogradouro) {
        this.pesLogradouro = pesLogradouro;
    }

    public Integer getPesNumero() {
        return pesNumero;
    }

    public void setPesNumero(Integer pesNumero) {
        this.pesNumero = pesNumero;
    }

    public String getPesComplemento() {
        return pesComplemento;
    }

    public void setPesComplemento(String pesComplemento) {
        this.pesComplemento = pesComplemento;
    }

    public String getPesBairro() {
        return pesBairro;
    }

    public void setPesBairro(String pesBairro) {
        this.pesBairro = pesBairro;
    }

    public String getPesEmail() {
        return pesEmail;
    }

    public void setPesEmail(String pesEmail) {
        this.pesEmail = pesEmail;
    }

    public String getPesFonecelular() {
        return pesFonecelular;
    }

    public void setPesFonecelular(String pesFonecelular) {
        this.pesFonecelular = pesFonecelular;
    }

    public Boolean getPesAceitotermosuso() {
        return pesAceitotermosuso;
    }

    public void setPesAceitotermosuso(Boolean pesAceitotermosuso) {
        this.pesAceitotermosuso = pesAceitotermosuso;
    }

    public Date getPesDatahorareg() {
        return pesDatahorareg;
    }

    public void setPesDatahorareg(Date pesDatahorareg) {
        this.pesDatahorareg = pesDatahorareg;
    }

    public boolean isPesFaztratamentopressaoalta() {
        return pesFaztratamentopressaoalta;
    }

    public void setPesFaztratamentopressaoalta(boolean pesFaztratamentopressaoalta) {
        this.pesFaztratamentopressaoalta = pesFaztratamentopressaoalta;
    }

    public boolean isPesEfumante() {
        return pesEfumante;
    }

    public void setPesEfumante(boolean pesEfumante) {
        this.pesEfumante = pesEfumante;
    }

    public String getPesProfissionalregistro() {
        return pesProfissionalregistro;
    }

    public void setPesProfissionalregistro(String pesProfissionalregistro) {
        this.pesProfissionalregistro = pesProfissionalregistro;
    }

    public CidadeModel getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(CidadeModel cidCodigo) {
        this.cidCodigo = cidCodigo;
    }
    

    @Override
    public String toString() {
        return "PessoaModel{" +
                "pesCodigo=" + pesCodigo +
                ", pesNome='" + pesNome + '\'' +
                ", pesDatanascimento=" + pesDatanascimento +
                ", pesSenha='" + pesSenha + '\'' +
                ", pesEnumsexo='" + pesEnumsexo + '\'' +
                ", pesNacionalidade='" + pesNacionalidade + '\'' +
                ", pesLogradouro='" + pesLogradouro + '\'' +
                ", pesNumero=" + pesNumero +
                ", pesComplemento='" + pesComplemento + '\'' +
                ", pesBairro='" + pesBairro + '\'' +
                ", pesEmail='" + pesEmail + '\'' +
                ", pesFonecelular='" + pesFonecelular + '\'' +
                ", pesAceitotermosuso=" + pesAceitotermosuso +
                ", pesDatahorareg=" + pesDatahorareg +
                ", pesFaztratamentopressaoalta=" + pesFaztratamentopressaoalta +
                ", pesEfumante=" + pesEfumante +
                ", pesProfissionalregistro='" + pesProfissionalregistro + '\'' +
                ", cidCodigo=" + cidCodigo +
                '}';
    }
}

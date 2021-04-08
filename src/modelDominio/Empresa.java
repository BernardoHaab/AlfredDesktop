package modelDominio;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Empresa implements Serializable {
    private static final long serialVersionUID = 123456789L;
    private int codEmpresa;
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Boolean abertoFechadoEmpresa;
    private int codCategoria;
    private String nomeCategoria;
    private int notaAvaliacao;
    private byte[] imagemEmpresa;


    public Empresa(int codEmpresa, String nomeEmpresa, String cnpjEmpresa, Boolean abertoFechadoEmpresa, int codCategoria, byte[] imagemEmpresa) {
        this.codEmpresa = codEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.abertoFechadoEmpresa = abertoFechadoEmpresa;
        this.codCategoria = codCategoria;
        this.imagemEmpresa = imagemEmpresa;
    }

    public Empresa(String nomeEmpresa, String cnpjEmpresa, Boolean abertoFechadoEmpresa, int codCategoria, byte[] imagemEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.abertoFechadoEmpresa = abertoFechadoEmpresa;
        this.codCategoria = codCategoria;
        this.imagemEmpresa = imagemEmpresa;
    }

    public Empresa(int codEmpresa, String nomeEmpresa) {
        this.codEmpresa = codEmpresa;
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public Empresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
    
    public static boolean validaCnpj(String CNPJ) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
            CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
            CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
            CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
            CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
           (CNPJ.length() != 14))
           return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
          sm = 0;
          peso = 2;
          for (i=11; i>=0; i--) {
        // converte o i-ésimo caractere do CNPJ em um número:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posição de '0' na tabela ASCII)
            num = (int)(CNPJ.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            if (peso == 10)
               peso = 2;
          }

          r = sm % 11;
          if ((r == 0) || (r == 1))
             dig13 = '0';
          else dig13 = (char)((11-r) + 48);

        // Calculo do 2o. Digito Verificador
          sm = 0;
          peso = 2;
          for (i=12; i>=0; i--) {
            num = (int)(CNPJ.charAt(i)- 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            if (peso == 10)
               peso = 2;
          }

          r = sm % 11;
          if ((r == 0) || (r == 1))
             dig14 = '0';
          else dig14 = (char)((11-r) + 48);

        // Verifica se os dígitos calculados conferem com os dígitos informados.
          if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
             return(true);
          else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public Boolean getAbertoFechadoEmpresa() {
        return abertoFechadoEmpresa;
    }

    public void setAbertoFechadoEmpresa(Boolean abertoFechadoEmpresa) {
        this.abertoFechadoEmpresa = abertoFechadoEmpresa;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public byte[] getImagemEmpresa() {
        return imagemEmpresa;
    }

    public void setImagemEmpresa(byte[] imagemEmpresa) {
        this.imagemEmpresa = imagemEmpresa;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "codEmpresa=" + codEmpresa + ", nomeEmpresa=" + nomeEmpresa + ", cnpjEmpresa=" + cnpjEmpresa + ", abertoFechadoEmpresa=" + abertoFechadoEmpresa + ", codCategoria=" + codCategoria + ", imagemEmpresa=" + imagemEmpresa + '}';
    }

}   

package aula2;
import java.util.Scanner;
public class Pessoa {
   Scanner in = new Scanner(System.in);
     private String nome;
     private date anoNascimento;
     private String estadoCivil;
     private String genero;
     private int rg;
     private int cpf;
     private String email;
     private int telefone;
     private String endereco;
     private int cep;

    public void setNome(String nome) {
      this.nome = nome;
      }
    public void setAnoNascimento(date anoNascimento) {
      this.anoNascimento = anoNascimento;
      }
    public void setEstadoCivil(String estadoCivil) {
      this.estadoCivil = estadoCivil;
      }
    public void setGenero(String genero) {
      this.genero = genero;
      }
    public void setRg(int rg) {
      this.rg = rg;
      }
    public void setCpf(int cpf) {
      this.cpf = cpf;
      }
    public void setEmail(String email) {
      this.email = email;
      }
    public void setTelefone(int telefone) {
      this.telefone = telefone;
      }
    public void setEndereco(String Endereco) {
      this.endereco = endereco;
      }
    public void setCep(int cep) {
      this.cep = cep;
      }
/* - - - T - - - */
    public String getNome() {
      return this.nome;
      return nome;
      }
       public date getAnoNascimento() {
      return this.anoNascimento;
      return anoNascimento;
      }
    public String getEstadoCivil() {
      return this.estadoCivil;
      return estadoCivil;
      }
    public String getGenero() {
      return this.genero;
      return genero;
      }
    public int getRg() {
      return this.rg;
      return rg;
      }
    public int getCpf() {
      return this.cpf;
      return cpf;
      }
    public String getEmail() {
      return this.email;
      return email;
      }
    public int getTelefone() {
      return this.telefone;
      return telefone;
      }
    public String getEndereco() {
      return this.endereco;
      return endereco;
      }
    public int getCep() {
      return this.cep;
      return cep;
      }
}

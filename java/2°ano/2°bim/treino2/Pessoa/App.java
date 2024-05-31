package aula2;
import java.util.Scanner;
public class App {
 public static void main(String[]args) {
   pessoa p1 = new Pessoa();
   p1.nome ="João";
   p1.anoNascimento = 25/05/2005;
   p1.estadoCivil ="Solteiro";
   p1.genero ="Masculino";
   p1.rg = 02228452955;
   p1.cpf = 33220011644;
   p1.email ="jojo@gmail.com";
   p1.telefone = 11970147456;
   p1.endereco ="R. Michel Azevedo n°46";
   p1.cep = 13165000;

   System.out.println(p1.nome);
   System.out.println(p1.anoNascimento);
   System.out.println(p1.estadoCivil);
   System.out.println(p1.genero);
   System.out.println(p1.rg);
   System.out.println(p1.cpf);
   System.out.println(p1.email);
   System.out.println(p1.telefone);
   System.out.println(p1.endereco);
   System.out.println(p1.cep);

   p1.setNome("João");
   p1.setAnoNascimento(25/05/2005);
   p1.setEstadoCivil("Solteiro");
   p1.setGenero("Masculino");
   p1.setRg(02228452955);
   p1.setCpf(33220011644);
   p1.setEmail("jojo@gmail.com");
   p1.setTelefone(11970147456);
   p1.setEndereco("R. Michel Azevedo n°46");
   p1.setCep(13165000);

   System.out.println(p1.getNome());
   System.out.println(p1.getAnoNascimento());
   System.out.println(p1.getEstadoCivil());
   System.out.println(p1.getGenero());
   System.out.println(p1.getRg());
   System.out.println(p1.getCpf());
   System.out.println(p1.getEmail());
   System.out.println(p1.getTelefone());
   System.out.println(p1.getEndereco());
   System.out.println(p1.getCep());
   }
}

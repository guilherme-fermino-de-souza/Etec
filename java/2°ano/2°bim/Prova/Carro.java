import java.util.Scanner;
public class Carro {
  Scanner in = new Scanner(System.in);

   private String modelo;
   private String fabricante;
   private String anoFabricacao;

 public void setModelo(String modelo) {
   this.modelo = modelo;
 }
 public void setFabricante(String fabricante) {
   this.fabricante = fabricante;
 }
 public void setAnoFabricacao(String anoFabricacao) {
   this.anoFabricacao = anoFabricacao;
 }

public String getModelo() {
  return modelo;
}
public String getFabricante() {
  return fabricante;
}
public String getAnoFabricacao() {
  return anoFabricacao;
}
}

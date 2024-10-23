package Model; //Apenas Modelagem da aplicação
//Atributos e Gets and Sets
public class Produto {
	/* ( Alt + Shift + S ->
	generate Getters and Setters )
	Gera Get e Set automaticamente */
	
	private int idProduto;
	private String produto;
	private double valorProduto;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}

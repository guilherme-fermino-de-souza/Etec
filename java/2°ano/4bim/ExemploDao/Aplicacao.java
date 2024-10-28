package prjExemploDao;
/*Data Acess Object
(Objeto de Acesso a Dados) */

import java.sql.SQLException;
import java.util.List;

import Model.Produto;
import DAO.ProdutoDao;

public class Aplicacao {

	public static void main(String[] args) throws SQLException{

		Produto produto = new Produto(); //1° Objeto
		
		produto.setIdProduto(1);
		produto.setProduto("Biscoito de cholate");
		produto.setValorProduto(5);
		
		ProdutoDao produtoDao = new ProdutoDao(); //2° Objeto
		//produtoDao.adicionar(produto); //Adiciona Novo Produto
		
		//produtoDao.alterar(produto); //Altera Produto
		
		produtoDao.excluir(produto); //Exclui Produto
		
		List<Produto> produtos = new ProdutoDao().getLista(); //Atributo Lista que carrega o SELECT do ProdutoDao
		
		for(Produto pro: produtos) { //Exibe os carrgados da lista
			System.out.println("Id: "+pro.getIdProduto()+" Produto: "+ pro.getProduto()+" Valor: R$" + pro.getValorProduto());
		}
	}

}

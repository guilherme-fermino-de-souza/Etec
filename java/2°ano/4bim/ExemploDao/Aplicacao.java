package prjExemploDao;
/*Data Acess Object
(Objeto de Acesso a Dados) */

import java.sql.SQLException;
import Model.Produto;
import DAO.ProdutoDao;

public class Aplicacao {

	public static void main(String[] args) throws SQLException{

		Produto produto = new Produto(); //1° Objeto
		
		produto.setProduto("Biscoito");
		produto.setValorProduto(4);
		
		ProdutoDao produtoDao = new ProdutoDao(); //2° Objeto
		produtoDao.adicionar(produto);
		

	}

}

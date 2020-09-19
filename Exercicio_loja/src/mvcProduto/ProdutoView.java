package mvcProduto;

public class ProdutoView {
	
	public void imprimeProduto(int idProduto, String nomeProduto, String descricaoProduto, int estoqueProduto, double precoProduto ) {
		System.out.println("Produto");
		System.out.println("\nCódigo do Produto: " + idProduto);
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Breve descrição: " + descricaoProduto);
		System.out.println("Quantidade em estoque: " + estoqueProduto);
		System.out.println("Preço: " + precoProduto);
	}
}

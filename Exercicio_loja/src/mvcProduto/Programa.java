package mvcProduto;

public class Programa {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		ProdutoView pv = new ProdutoView();
		
		ProdutoController pc = new ProdutoController(produto, pv);
		
		pc.setIdProduto(1);
		pc.setNomeProduto("1969 Harley Davidson Ultimate Chopper");
		pc.setDescricaoProduto("This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain, wheels and steering. "
				+ "All parts are particularly delicate due to their precise scale and require special care and attention.");
		pc.setEstoqueProduto(33);
		pc.setPrecoProduto(20810.00);
		
		pc.atualizarView();
		
	}
}

public class VerificaNumerosPrimos {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Nenhum argumento foi passado");
			return;
		}
		
		for (String numString : args) {
			int num = Integer.parseInt(numString);
			Thread th = new Thread(new NumPrimo(num));
			th.start();
		}
	}
}
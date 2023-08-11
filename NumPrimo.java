
public class NumPrimo implements Runnable {
	
	private final int num;
	
	public NumPrimo (int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		if (ehPrimo(num)) {
			System.out.println("O número " + num + " é primo");
		} else {
			System.out.println("O número " + num + " não é primo");
		}
	}
	
	private boolean ehPrimo(int num) {
		for (int j = 2; j < num; j++) {
            if (num % j == 0)
                return false;   
        }
        return true;
	}
}
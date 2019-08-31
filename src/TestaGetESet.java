
public class TestaGetESet {

	public static void main(String[] args) {
		int total = 0;
		Conta conta = new Conta(123, 456);
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1233);
		
		Conta conta2 = new Conta(111, 222);
		Conta conta3 = new Conta(555, 444);
		
		System.out.println(Conta.getTotal());
	}
}

/**
 * 
 */
package code.test.tamil;

/**
 * 
 */
public class HDFCBank {
	
	//constructor
	public HDFCBank() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//creating bank
		HDFCBank hdfcBank = new HDFCBank();
		
		//creating customer for Tamilselvan
		Customer tamilselvan = new Customer();
		tamilselvan.accountNo = 6006;
		tamilselvan.name = "Tamilselvan Radhakrishnan";
		tamilselvan.city = "Chennai";
		
		//creating creditcard for Tamilselvan
		CreditCard tamilCC = new CreditCard();
		tamilCC.creditCardNo = 11;
		tamilCC.customerName = "Tamilselvan Radhakrishnan";
		
		System.out.println("Customer Tamilselvan details are :" + tamilselvan);
		System.out.println("Creditcard Tamilselvan details are :" + tamilCC);
		System.out.println("Creditcard cardType of Tamilselvan is :" + tamilCC.cardType);
		System.out.println("-----------------------------------------------------------------------" );
		
		//creating customer for Vijayalakshmi
		Customer vijayalakshmi = new Customer();
		vijayalakshmi.accountNo = 7777;
		vijayalakshmi.name = "Vijayalakshmi D";
		vijayalakshmi.city = "Chennai";
		
		//creating creditcard for Vijayalakshmi
		CreditCard vijiCC = new CreditCard();
		vijiCC.creditCardNo = 22;
		vijiCC.customerName = "Vijayalakshmi D";
		
		System.out.println("Customer Vijayalakshmi details are :" + vijayalakshmi);
		System.out.println("Creditcard Vijayalakshmi details are :" + vijiCC);
		System.out.println("Creditcard cardType of Vijayalakshmi is :" + vijiCC.cardType);
		
		
		

	}
	
	public static void print(String value) {
		
		System.out.println("public method from HDFCBank is :" + value);
		
	}

}

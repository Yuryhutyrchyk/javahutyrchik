package classTest;

public class MainProducerAndCustomer {
	public static void main(String[] args) {
		ProducerAndCustomer ProducerAndCustomer = new ProducerAndCustomer();
		new Customer(ProducerAndCustomer);
		new Producer(ProducerAndCustomer);
	}
}



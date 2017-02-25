package pp.main;

import oracle.jrockit.jfr.JFR;
import pp.panel.ShoppingCartPanel;
import pp.shop.Order;
import pp.shop.PaymentProcess;

import javax.swing.*;

/**
 * Created by Justin on 25-2-2017.
 */
public class Main {

	public static final int PAYMENT_WINDOW_WIDTH = 400;
	public static final int PAYMENT_WINDOW_HEIGHT = 300;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Order order = new Order();
		PaymentProcess paymentProcess = new PaymentProcess();
		ShoppingCartPanel shoppingCartPanel = new ShoppingCartPanel(order, paymentProcess);

		frame.setContentPane(shoppingCartPanel);
		frame.setSize(PAYMENT_WINDOW_WIDTH, PAYMENT_WINDOW_HEIGHT);
		frame.setVisible(true);
	}
}

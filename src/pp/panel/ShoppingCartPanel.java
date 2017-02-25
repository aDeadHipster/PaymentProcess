package pp.panel;

import pp.shop.Order;
import pp.shop.PaymentProcess;

import javax.swing.*;
import java.awt.*;

import static pp.main.Main.*;

/**
 * Created by Justin on 25-2-2017.
 */
public class ShoppingCartPanel extends JPanel {

	Order order;
	PaymentProcess paymentProcess;

	public ShoppingCartPanel(Order order, PaymentProcess paymentProcess) {
		this.order = order;
		this.paymentProcess = paymentProcess;

		this.setSize(PAYMENT_WINDOW_WIDTH, PAYMENT_WINDOW_HEIGHT);
		this.setBackground(Color.LIGHT_GRAY);
	}
}

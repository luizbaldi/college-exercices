import java.awt.*;

public class JanelaGrafica extends Frame {
	private Button[] numbers;
	private Button butSum, butSubtract;
	private Panel center, bottom;
	
	JanelaGrafica() {
		super("Programação Modular - Lab 10");
		
		setBounds(150,200, 450, 350);
	
		// Creating components;
		
		// Numbers
		numbers = new Button[10];
		center = new Panel();
		center.setLayout(new FlowLayout());
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Button(String.valueOf(i));
			center.add(numbers[i]);
		}
		
		// Operators
		bottom = new Panel();
		bottom .setLayout(new FlowLayout());
		butSum = new Button("+");
		butSubtract = new Button("-");
		bottom.add(butSum);
		bottom.add(butSubtract);
		
		setLayout(new BorderLayout());
		

		// Adding panels to container
		add(center, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);
	}
}

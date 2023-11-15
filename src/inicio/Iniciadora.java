package inicio;

import java.awt.EventQueue;

import GUI.Primera;

public class Iniciadora {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primera frame = new Primera();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

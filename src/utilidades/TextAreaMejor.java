package utilidades;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

public class TextAreaMejor extends JTextArea{

		public TextAreaMejor() {
			addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					TextAreaMejor text = (TextAreaMejor) e.getSource();
					 if (text.getText().length() == limite)
					 e.consume();
				}
			});
		}
		private int limite = -1;
		public int getLimite() {
		 return this.limite;
		}
		public void setLimite(int limite) {
		 if (limite >= -1)
		 this.limite = limite;
		}

}


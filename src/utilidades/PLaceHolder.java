package utilidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;

import GUI.Colores;

public class PLaceHolder extends JTextField{

	private String ph;
	
	public PLaceHolder(String ph)
	{
		this.ph=ph;
	}
	
	public PLaceHolder()
	{
		this.ph=null;
	}
	
	public String getText()
	{
		String text= super.getText();
		if(text.trim().length()==0 && ph!=null)
		{
			text=ph;
		}
		return text;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(super.getText().length()>0 || ph==null)
		{
			return;
		}
		Graphics2D g2= (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Colores.getVerdeoscuro());
		g2.drawString(ph, getInsets().left, g.getFontMetrics().getMaxAscent() + getInsets().top);
	}
	
}

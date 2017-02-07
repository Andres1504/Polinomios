import javax.swing.*;

public class Ventana extends JFrame {
	public Ventana (){
			
		PanelPrin pn = new PanelPrin();
		this.add(pn);
		
		this.setBounds(150, 150, 400, 350);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


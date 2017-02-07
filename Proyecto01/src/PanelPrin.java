import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrin extends JPanel {
	
	private JLabel poli1;
	private JLabel pol2;
	private JLabel x1;
	private JLabel x2;
	
	private JTextField coef1;
	private JTextField coef2;
	private JTextField expo2;
	private JTextField expo1;
	
	private JLabel resultado;
	private JLabel pol1;
	private JLabel poli2;
	
	private JButton suma;
	private JButton resta;
	private JButton multi;
	private JButton mos1;
	private JButton mos2;
	private JButton agregar1;
	private JButton agregar2;
	
	public PanelPrin(){
		this.setLayout(null);
		
		this.poli1 = new JLabel("Polinomio 1:");
		this.poli1.setBounds(20, 20, 200, 30);
		this.coef1 = new JTextField(" ");
		this.coef1.setBounds(20, 50, 40, 30);
		this.x1 = new JLabel("X");
		this.x1.setBounds(65, 50, 20, 30);
		this.expo1 = new JTextField("");
		this.expo1.setBounds(75, 50, 20, 18);
		this.agregar1 = new JButton("Agregar");
		this.agregar1.setBounds(100, 40, 120, 35);
		
		this.pol2 = new JLabel("Polinomio2: ");
		this.pol2.setBounds(20, 80, 200, 30);
		this.coef2 = new JTextField("");
		this.coef2.setBounds(20, 110, 40, 30);
		this.x2 = new JLabel("X");
		this.x2.setBounds(65, 110, 20, 30);
		this.expo2 = new JTextField();
		this.expo2.setBounds(75, 110, 20, 18);
		this.agregar2 = new JButton("Agregar");
		this.agregar2.setBounds(100, 105, 120, 35);
		
		
		this.suma = new JButton("Sumar");
		this.suma.setBounds(250, 40, 120, 35);
		this.resta = new JButton("Resta");
		this.resta.setBounds(250, 80, 120, 35);
		this.multi = new JButton("Multiplicacion");
		this.multi.setBounds(250, 120, 120, 35);
		
		this.pol1 = new JLabel("Polinomio 1");
		this.pol1.setBounds(20, 160, 350, 30);
		this.poli2 = new JLabel("Polinomio 2");
		this.poli2.setBounds(20, 200, 350, 30);
		
		this.resultado = new JLabel("resultado ");
		this.resultado.setBounds(20, 220, 350, 100);
		
				
		this.add(coef1);
		this.add(poli1);
		this.add(x1);
		this.add(expo1);
		this.add(agregar1);
		
		this.add(pol2);
		this.add(coef2);
		this.add(x2);
		this.add(expo2);
		this.add(agregar2);
		
		this.add(suma);
		this.add(resta);
		this.add(multi);
		
		this.add(pol1);
		this.add(poli2);
		this.add(resultado);
		
		
		Lista lista2 = new Lista();
		Lista lista = new Lista();
		Lista lisAux1 = new Lista();
		Lista lisAux2 = new Lista();
		
		agregar1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String coef, expo;
				try
				{
					if(coef1.getText().trim().length() == 0){
						JOptionPane.showMessageDialog(null, "Ingresa un coeficiente");
					}else if(expo1.getText().trim().length()==0){
						JOptionPane.showMessageDialog(null, "Ingresa el exponente");
					}else{
						//Monomio mon = new Monomio();
					//	Lista lista = new Lista();
						//Lista lista2 = new Lista();
						
						
						coef = coef1.getText().trim();
						Integer coef11 = Integer.parseInt(coef);
						expo = expo1.getText().trim();
						Integer expo11 = Integer.parseInt(expo); 
						
						lista.insertar(coef11, expo11);
						
						
					}
				}catch (Exception ex){
					JOptionPane.showMessageDialog( null, ""+ ex.getMessage());
				}
				coef1.setText("");
				expo1.setText("");
			}
		});
		
		

		agregar2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String coef, expo;
				try
				{
					if(coef2.getText().trim().length() == 0){
						JOptionPane.showMessageDialog(null, "Ingresa un coeficiente");
					}else if(expo2.getText().trim().length()==0){
						JOptionPane.showMessageDialog(null, "Ingresa el exponente");
					}else{
						//Monomio mon = new Monomio();
						//Lista lista2 = new Lista();
						
						
						
						coef = coef2.getText().trim();
						Integer coef1 = Integer.parseInt(coef);
						expo = expo2.getText().trim();
						Integer expo1 = Integer.parseInt(expo); 
						
						lista2.insertar(coef1, expo1);
						
						
						
					}
				}catch (Exception ex){
					JOptionPane.showMessageDialog( null, ""+ ex.getMessage());
				}
				coef2.setText(" ");
				expo2.setText(" ");
			}
		});
		
		
		
		suma.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				try {
					pol1.setText(lista.mostrar2());
					poli2.setText(lista2.mostrar2());
					resultado.setText(lisAux1.resultadoSuma(lista, lista2));
				} catch (ListaVaciaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			/*	try{
					/*
					Lista lisAux3 = lisAux1.copiar(lista);
					Lista lisAux4 = lisAux2.copiar(lista2);
					//lisAux1.mostrar();
					//lisAux2.mostrar();
					lisAux1.sumar(lisAux3, lisAux4);
					//String aux = " ";
					//String aux = lisAux1.convertir(lisAux1);*/
					
					//resultado.setText("pendejada");
					//JOptionPane.showMessageDialog(null, "Hola Mundo");
					
					//String res;
					
					/*
				}catch (Exception ex){
					JOptionPane.showMessageDialog( null, ""+ ex.getMessage());
				}*/
				//resultado.setText(lisAux1.convertir(lisAux1))
			}			
		});
		
		
		
		resta.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				try {
					pol1.setText(lista.mostrar2());
					poli2.setText(lista2.mostrar2());
					resultado.setText(lisAux1.resultadoResta(lista, lista2));
				} catch (ListaVaciaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}			
		});
		
	multi.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				try {
					//lisAux1.resultadoMulti(lista, lista2);
					//lisAux1.mostrar();
					//String aux = lisAux1.convertir(lisAux1);
					pol1.setText(lista.mostrar2());
					poli2.setText(lista2.mostrar2());
					resultado.setText(lisAux1.multiplicar(lista, lista2));
				} catch (ListaVaciaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ElementoNoEncontradoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}			
		});
	
		
	
	}              
	

}

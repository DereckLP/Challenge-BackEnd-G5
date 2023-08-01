package conversorMoneda;
import javax.swing.JOptionPane;



public class Conversor {
    public static void main(String[] args) {
    	String cantidadString;
    	Double cantidadDouble = null;
        String[] monedas = {
                "Dólar estadounidense (USD)",
                "Euro (EUR)",
                "Libra esterlina (GBP)",
                "Yuan chino (CNY)",
                "Quetzal guatemalteco (GTQ)",
                "Peso mexicano (MXN)"};
        
    	
    	
    	JOptionPane.showMessageDialog(
    			null, 
    			"Bienvenido al conversor de monedas "
    			+ "\n1)Selecciona tu moneda "
    			+ "\n2)Ingresa la Cantidad "
    			+ "\n3)Selecciona una moneda a convertir \n ",
    			"Conversor de Monedas",
    			JOptionPane.PLAIN_MESSAGE );
    	String eleccionmoneda =  (String) JOptionPane.showInputDialog(null, "Selecciona tu moneda", "Conversor", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);




    		try {
    			cantidadString = JOptionPane.showInputDialog(null,"ingrese una cantidad");
    			cantidadDouble = Double.parseDouble(cantidadString);
    			if (cantidadDouble.getClass().getSimpleName().equals("Double")) {
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Hubo un error,el dato debe ser numérico, ¿desea continuar?", "ERROR", JOptionPane.ERROR_MESSAGE);
		
		}
    		


    	switch (eleccionmoneda) {
			case "Dólar estadounidense (USD)":
				
				JOptionPane.showMessageDialog(
						null,
						"Euro: " + 0.91*cantidadDouble 
						+ "\nYuan: " + 7.18*cantidadDouble 
						+ "\nLibra: " + 0.78*cantidadDouble
						+ "\nQuetzal: " + 7.87*cantidadDouble
						+ "\nPeso: " + 16.87*cantidadDouble);
				break;
			case"Euro (EUR)":
				JOptionPane.showMessageDialog(
						null,
						"Dolar: " + 1.10*cantidadDouble 
						+ "\nYuan: " + 7.88*cantidadDouble 
						+ "\nLibra: " + 0.86*cantidadDouble
						+ "\nQuetzal: " + 8.63*cantidadDouble
						+ "\nPeso: " + 18.53*cantidadDouble);
				break;
			case"Libra esterlina (GBP)":
				JOptionPane.showMessageDialog(
						null,
						"Dolar: " + 1.28*cantidadDouble 
						+ "\nYuan: " + 9.17*cantidadDouble 
						+ "\nEuro: " + 1.16*cantidadDouble
						+ "\nQuetzal: " + 10.04*cantidadDouble
						+ "\nPeso: " + 21.55*cantidadDouble);
				break;
			case"Yuan chino (CNY)":
				JOptionPane.showMessageDialog(
						null,
						"Dolar: " + 0.14*cantidadDouble 
						+ "\nEuro: " + 0.13*cantidadDouble 
						+ "\nLibra: " + 0.11*cantidadDouble
						+ "\nQuetzal: " + 1.09*cantidadDouble
						+ "\nPeso: " + 2.37*cantidadDouble);
				break;
			case"Quetzal guatemalteco (GTQ)":
				JOptionPane.showMessageDialog(
						null,
						"Dolar: " + 0.13*cantidadDouble 
						+ "\nEuro: " + 0.12*cantidadDouble 
						+ "\nLibra: " + 0.10*cantidadDouble
						+ "\nYuan: " + 0.91*cantidadDouble
						+ "\nPeso: " + 2.15*cantidadDouble);
				break;
			case"Peso mexicano (MXN)":
				JOptionPane.showMessageDialog(
						null,
						"Dolar: " + 0.059*cantidadDouble 
						+ "\nEuro: " + 0.054*cantidadDouble 
						+ "\nLibra: " + 0.046*cantidadDouble
						+ "\nYuan: " + 0.43*cantidadDouble
						+ "\nQuetzal: " + 0.47*cantidadDouble);
				break;		

		default:
			break;
		}
}
}
package pos;

import javax.swing.JOptionPane;

public class UI implements ChefListener{

	public static void main(String[] args) {
		UI ui=new UI();
		
		for(int i=0;i<5;i++)
		ui.prompt();
		
	}

	private void prompt() {
		Pizza ct= new Pizza("Cheese and tomato",2,5);
		Pizza bbq= new Pizza("Barbeque",5,5);
		Pizza vs= new Pizza("veggie supreme",10,8);
		
		Pizza[] availablePizzas=new Pizza[]{ct,bbq,vs};
		
		String[] names={availablePizzas[0].getName(),availablePizzas[1].getName(),availablePizzas[2].getName()};
		
		try{
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null, names[0] +"\n"+ names[1]+"\n" + names[2]+"\n"+"Enter choice(0,1,2) :","Pizza Menu"));	
	
		Pizza selection=availablePizzas[choice];
		
		Chef chef = new Chef(selection,this);// TODO Auto-generated method stub
		chef.start();
		} catch (Exception e) {
			System.exit(0);
			// TODO Auto-generated catch block
			
		}
		
		
	}

	@Override
	public void pizzaCooked(Pizza pizza) {
	JOptionPane.showMessageDialog(null, pizza.getName()+"Your pizza has been cooked, Enjoy!.");
		
	}

}

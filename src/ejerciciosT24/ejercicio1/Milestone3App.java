package ejerciciosT24.ejercicio1;

public class Milestone3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora = 23;
		int minuto = 58;
		int segundo = 57;
		boolean funciona = true;
		
		while(funciona) {
			System.out.println(hora + ":" + minuto + ":" + segundo); 
			
			try {
				Thread.sleep(1000);
				
				if(segundo < 59) {
					segundo ++;
					
				} else  {
					segundo = 0;
					if(minuto < 59) {
					minuto ++;
						
					} else {
						minuto = 0;
						if (hora <= 24) {
							hora ++;
							
						} else {
							hora = 0;
							
						}
					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

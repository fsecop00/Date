import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Date fecha1 = new Date(1,1,1993);
		Date fecha2 = new Date(5,2,1992);
		number primo = new number(4);
		System.out.println(fecha1.isSameYear(fecha2));
		System.out.println(fecha1.isSameMonth(fecha2));
		System.out.println(fecha1.isSameDay(fecha2));
		System.out.println(fecha1.isSame(fecha2));
		fecha1.mes();
		fecha1.chequea();
		fecha2.chequea();
		fecha1.estaciones();
		fecha2.estaciones();
		fecha2.imprimir();
		fecha1.generaFecha();
		Scanner teclado = new Scanner(System.in);
		int num1= teclado.nextInt();
		multiplicacion(num1);
		conversion();


		}
	static void multiplicacion(int a){	
		int resultado=0;
		for (int i=0;i<=10;i++){
			resultado=a*i;
			System.out.println(a+"x"+i+"="+resultado);
		}
	}
	
	static void conversion(){
		float fa=0;
		
		for(float i=-30;i<=30;i++){
			fa=i*2-i/5;
			fa=fa+32;
			System.out.println(i+" Grados es = "+fa);
			
			
			
		}
	}

}

import java.util.*;
public class Date {
	int diat;
	int mest;
	int aniot;

	public Date(int dia, int mes, int anio)
	{
		diat=dia;
		mest=mes;
		aniot=anio;
		System.out.println(+diat+","+mest+","+aniot);
		
	}
	public boolean isSameYear(Date fecha){
		/*if(aniot==fecha.aniot)
		{
			return true;
		}
		else{
		return false;
		}*/
		return comparar(aniot,fecha.aniot);
	}
	public boolean isSameMonth(Date fecha){
		/*if(mest==fecha.mest){
			return true;
		}else{
			return false;
		}*/
		return comparar(mest,fecha.mest);
	}
	public boolean isSameDay(Date fecha){
		/*if(diat==fecha.diat){
			return true;
		}else{
		return false;
		}*/
		return comparar(diat,fecha.diat);
	}
	public boolean isSame(Date fecha){
		if(diat==fecha.diat && mest==fecha.mest && aniot==fecha.aniot){
			return true;
		}else{
		return false;
		}
	}
	public boolean comparar(int a, int b){
		if(a==b){
			return true;
		}else{
		return false;
		}
	}
	public void mes(){
		switch(mest){
		case 1: System.out.println("Enero");break;
		case 2: System.out.println("Febrero");break;
		case 3: System.out.println("Marzo");break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Mayo");break;
		case 6: System.out.println("Junio");break;
		case 7: System.out.println("Julio");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Septiembre");break;
		case 10: System.out.println("Octubre");break;
		case 11: System.out.println("Noviembre");break;
		case 12: System.out.println("Diciembre");break;


		}
	}
	public void chequea(){
		if(mest==1 || mest==3 || mest==5 || mest==7 || mest==8 || mest==10 || mest==12){
			if(diat>=0 && diat<=31)
			{
				System.out.println("El dia "+diat+" del mes "+ mest+" es correcto");
			}
			else{
				System.out.println("El dia "+diat+" del mes "+ mest+" no es correcto");
			}
		}
		else{
			if(mest==4 || mest==6 || mest==9 || mest==11){
				if(diat>=0 && diat<=30)
				{
					System.out.println("El dia "+diat+" del mes " +mest+" es correcto");
				}
				else{
					System.out.println("El dia "+diat+" del mes " +mest+" no es correcto");
				}
					
					
			}
			else{
				if(aniot%4==0 && (aniot%100!=0 || aniot%400==0))
				{
					if(diat>=0 && diat<=29)
					{
						System.out.println("El dia "+diat+" del mes "+ mest+" es correcto");
					}
					else{
						System.out.println("El dia "+diat+" del mes " +mest+" no es correcto");
					}
				}
				else{
					if(diat>=0 && diat<=28)
					{
						System.out.println("El dia "+diat+" del mes "+ mest+" es correcto");
					}
					else{
						System.out.println("El dia "+diat+" del mes " +mest+" no es correcto");
					}
				}
				
			}
		}
		
	}
	public void estaciones(){
		if(mest<=3){
			System.out.println("invierno");
		}else{
			if(mest>=4 && mest<=6){
				System.out.println("Primavera");
			}else{
				if(mest>=7 && mest<=9){
					System.out.println("Verano");
					
				}else{
					System.out.println("Otoño");
				}
			}
		}
		
	}
	public void imprimir(){
		String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octrubre","Noviembre","Diciembre"};
		for(int i=mest;i<12;i++){
		System.out.println("Meses: "+meses[i] );
		}
		int cmes;
		int vmes[]={31,28,31,30,31,30,31,31,30,31,30,31};
		if(mest==1 || mest==3 || mest==5 || mest==7 || mest==8 || mest==10 || mest==12){
			cmes=1;
			if(diat>=0 && diat<=31)
			{
				for(int i=diat+1;i<=31;i++){
				System.out.println(i+","+mest+","+aniot);
				}
			}
			
		}
		else{
			if(mest==4 || mest==6 || mest==9 || mest==11){
				cmes=2;
				if(diat>=0 && diat<=30)
				{
					for(int i=diat+1;i<=30;i++){
						System.out.println(i+","+mest+","+aniot);
						}
				
					
					
			}
			}
			else{
				cmes=3;
				if(aniot%4==0 && (aniot%100!=0 || aniot%400==0))
				{
					if(diat>=0 && diat<=29)
					{
						for(int i=diat+1;i<=29;i++){
							System.out.println(i+","+mest+","+aniot);
							}
					}
					
				}
				else{
					if(diat>=0 && diat<=28)
					{
						for(int i=diat+1;i<=28;i++){
							System.out.println(i+","+mest+","+aniot);
							}
					}
					
					
				}
				
			}
		}
		switch((cmes))
		{
		case 1:System.out.println("Enero, Marzo, Mayo,Julio,Agosto,Octubre,Diciembre");break;
		case 2:System.out.println("Abril,Junio,Septiembre,Noviembre");break;
		case 3:System.out.println("Febrero");
		}
	int cont=0;
	for(int i=0;i<mest-1;i++){
		cont+=vmes[i];
	}
	cont+=diat;
	System.out.println("Los dias que han pasado son: "+cont);
	int semanas= cont/7;
	System.out.println("Las semanas que han pasado son: "+semanas);
	
	
	
	}
public void generaFecha(){
	int count=0;
	int count1=0;
	int dia=0;
	int mes=0;
	while(diat!=dia){
		dia = (int)(Math.random()*30+1);
		
		count++;
	}
	while(mest!=mes){
		mes = (int)(Math.random()*11+1);
		
		count++;
	}
	System.out.println("El numero de veces que lo ha intentado son: "+count);
	dia=0;
	mes=0;
	do{
		dia = (int)(Math.random()*30+1);
		count1++;
	}while(diat!=dia);
	do{
		mes = (int)(Math.random()*11+1);
		
		count1++;
		
	}while(mest!=mes);
	
		System.out.println("El numero de veces es: "+count1);
	}
	
	
	
	
}

	

	


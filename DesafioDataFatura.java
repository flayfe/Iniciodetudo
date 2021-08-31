package com.flayfe.cursobasicojava.loiane;

import java.util.*;
import java.text.*;

public class DesafioDataFatura {
	public static void main (String [] args) throws ParseException {
		
		//Solicita a data de vencimento da fatura
		Scanner entVenc = new Scanner(System.in);
		System.out.println("Digite a data de vencimento da futura abaixo: " + "\n *digite a data com barras no seguinte formato: dd/mm/aaaa");
		String dataReceb = entVenc.nextLine();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVenc = formato.parse(dataReceb);
		long millisVenc = dataVenc.getTime();
		
		//10 após o vencimento sem o juros
		long somaDezDias = (millisVenc + 864000000);
		Date vencDez = new Date(somaDezDias);
		
		//descobre o dia da semana
		Calendar cal = Calendar.getInstance();
		cal.setTime(vencDez); 
		int day = cal.get(Calendar.DAY_OF_WEEK);
				
		//se sabado(7- Saturday) ou domingo(1- Sunday)
		if (day == 7){
			long s = (somaDezDias + (86400000 * 2));
			Date vencSat = new Date(s);
			System.out.println("Baseada neste vencimento, a fatura pode ser paga sem cobrança de juros até a data: " + 
		formato.format(vencSat));			
		
		} else if (day == 1){
			long d = (somaDezDias + 86400000);
			Date vencSun = new Date(d);
			System.out.println("Baseada neste vencimento, a fatura pode ser paga sem cobrança de juros até a data: " +
		formato.format(vencSun));
		
		} else {
			System.out.println("Baseada neste vencimento, a fatura pode ser paga sem cobrança de juros até a data: " +
		formato.format(vencDez));
		}
		
		}

}

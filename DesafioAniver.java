package com.flayfe.cursobasicojava.loiane;

import java.util.*;
import java.text.*;

public class DesafioAniver {
	public static void main (String [] args) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date nascimento = format.parse("01/11/1991");
		long millisNasc = nascimento.getTime();
		//System.out.println(millisNasc);
		
		Date comparacao = format.parse("15/05/2010");
		long millisComp = comparacao.getTime();
		//System.out.println(millisComp);
		
		Date nasc = new Date(millisNasc);
		Date comp = new Date(millisComp);
		
		boolean isAfter = nasc.after(comp);
		boolean isBefore = nasc.before(comp);
		
		System.out.println("A data do meu nascimento é posterior a 15/05/2010? " + isAfter);
		System.out.println("A data do meu nascimento é anterior a 15/05/2010? " + isBefore);
		
	}
}
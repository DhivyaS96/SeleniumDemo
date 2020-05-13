package Java_Basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true;
		if(hungry == false) {
			System.out.println("Im starving");
		}else {
			System.out.println("Im not hungry");
		}
		
		int hungerRating=5;
		if(!(hungerRating<6)) {
			System.out.println("Im not hungry");
		}else {
			System.out.println("Im starving");
		}
		
		int favoriteTemp=75;
		int currentTemp=60;
		String opinion;
		
		if(favoriteTemp==currentTemp) {
		
		if(currentTemp<=(favoriteTemp-30)) {
			opinion="Its too cold";
		} else if(currentTemp<favoriteTemp-20) {
			opinion="Its kinda cold";
		} else if(currentTemp>=(favoriteTemp+10)) {
			opinion="Its not too cold";
		} else {
			opinion="Its a beautiful day";
		} 
		}else {
			opinion="unknown Temp";
		
		}
		System.out.println(opinion);
		
		
		//SWITCH STATEMENT
		
		int month=6;
		String monthString;
		switch(month) {
		case 1: monthString= "Jan";
		break;
		case 2: monthString="Feb";
		break;
		case 3: monthString="Mar";
		break;
		case 4: monthString="Apr";
		break;
		default: monthString="unknown";
		break;
		}
		System.out.println(monthString);
		

	}

}

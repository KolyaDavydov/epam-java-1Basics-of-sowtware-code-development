package ru.davydov.basic.branch;

/*
	3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
	Определить, будут ли они расположены на одной прямой.
*/

public class Task3 {
	public static void main (String[] args) {
		String oneStraight = "точки на одной прямой";
        String notStraight = "точки не на одной прямой";
        String result;
        
        int x1 = -1;
        int y1 = -1;
        
        int x2 = 3;
        int y2 = 3;
        
        int x3 = 0;
        int y3 = 0;
        
        if(y2 - y1 == 0) {
        	if(y3 == y1) result = oneStraight;
        	else result = notStraight;
        }
        
        else if(x2 - x1 == 0) {
        	if(x3 == x1) result = oneStraight;
        	else result = notStraight;
        }
        
        else if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            result = oneStraight;
        } 
        
        else {
            result = notStraight;
        }
        
        System.out.println(result);
    }
	
}


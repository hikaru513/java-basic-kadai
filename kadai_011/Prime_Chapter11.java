package Prime_Chapter11;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
        boolean[] primeJudge = new boolean[100];

    
        for (int k = 0; k < primeJudge.length; k++) {
            primeJudge[k] = true;
        }

        
        for (int i = 2; i <= 100; i++) {

          
            for (int r = 2; r < i; r++) {
                if (i % r == 0) {
                    primeJudge[i - 1] = false;
                    break;  
                }
            }
        }

        
        for (int j = 1; j < primeJudge.length; j++) {
            if (primeJudge[j] == true) {
                System.out.println(j + 1);
            }
	    }

	}

}

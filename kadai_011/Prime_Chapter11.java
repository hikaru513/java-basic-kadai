package Prime_Chapter11;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean bl=true;

	    for(int i=2; i<=100; i++) {
	        for(int j=2; j<=(i/2); j++) {
	            if(i%j==0){
	                bl=false;
	            }
	        }
	        if(bl){
	            System.out.println(i);
	        }else{
	            bl=true;
	        }
	    }

	}

}

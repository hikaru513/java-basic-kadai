package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	

		public String getMyChoice(){
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう"); 
			
			
			Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    if(!"r".equals(str) && !"s".equals(str) && !"p".equals(str)) {
		        
		    }
		    
		    return str;
		}

		public String getRandom() {
			String[] janken = {"r", "s", "p"};
			
			int i = (int)Math.floor(Math.random() * 3);
			
			switch(i) {
			case 0: return janken[0];
			case 1: return janken[1];
			case 2: return janken[2];
			default: return "";
			}
		}
	    
	    public void playGame(){
	    	String myChoice = getMyChoice();
	        String opponentChoice = getRandom();
	    	HashMap<String,String> jankente = new HashMap<String,String>();
	    	jankente.put("r", "グー");
	    	jankente.put("s", "チョキ");
	    	jankente.put("p", "パー");
	    	System.out.println("自分の手は" + jankente.get(myChoice) + "相手の手は" + jankente.get(opponentChoice));
	    	if(myChoice.equals(opponentChoice)) {
	    		System.out.println("あいこです");
	    	}else if((myChoice.equals("r") && opponentChoice.equals("s")) || (myChoice.equals("s") && opponentChoice.equals("p")) || (myChoice.equals("p") && opponentChoice.equals("r"))){
	    		System.out.println("自分の勝ちです");
	    	}else if((myChoice.equals("r") && opponentChoice.equals("p")) || (myChoice.equals("s") && opponentChoice.equals("r")) || (myChoice.equals("p") && opponentChoice.equals("s"))){
	    		System.out.println("自分の負けです");
	    	}
	    }
	    

}

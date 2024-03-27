package kadai_017;

abstract public class Kato_Chapter17 {

	// フィールド（内部データ）
    private String familyName  = "加藤"; 
    public String givenName;  
    private String address = "東京都中野区〇×" ;  

    public void setGivenName(String givenName) {
    this.givenName = givenName;
}
    public void commonIntroduce() {
    	System.out.println("名前は" + this.familyName + this.givenName + "です");
    	System.out.println("住所は" + this.address + "です");
 
    }
    
   
    	abstract void eachIntroduce();
    
    
    public void execIntroduce(){
    	commonIntroduce();
		eachIntroduce();
    }

}

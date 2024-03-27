package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{
	
	 public void setGivenName() {
	        this.givenName = "花子"; 
	 }
	    // コンストラクタの追加
	    public KatoHanako_Chapter17() {
	        setGivenName(); 
	    }
	   
	   //抽象メソッドに具体的な処理を記述	する
	   void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	   }
	
}

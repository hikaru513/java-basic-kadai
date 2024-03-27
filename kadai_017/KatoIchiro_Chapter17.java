package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17{
	
	public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	 // コンストラクタで名前を設定
    public KatoIchiro_Chapter17() {
    	setGivenName( "一郎");
    }
	
	   //抽象メソッドに具体的な処理を記述	する
	   void eachIntroduce() {
	      System.out.println("好きな食べ物はリンゴです");
	   }
}


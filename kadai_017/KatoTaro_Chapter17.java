package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17{
	
	public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	// コンストラクタの追加
    public KatoTaro_Chapter17() {
        setGivenName("太郎"); // ここで名前をセット
    }
	

	   //抽象メソッドに具体的な処理を記述	する
	   void eachIntroduce() {
	      System.out.println("私はJavaが得意です");
	   }
	
}


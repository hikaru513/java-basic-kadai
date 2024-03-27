package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	// HashMapをクラスのフィールドとして定義
    HashMap<String, String> fruitAry = new HashMap<String, String>();

    String givenWord;

    public void fruitDic() {
        fruitAry.put("apple", "りんご");
        fruitAry.put("peach", "桃");
        fruitAry.put("banana", "バナナ");
        fruitAry.put("lemon", "レモン");
        fruitAry.put("pear", "梨");
        fruitAry.put("kiwi", "キウィ");
        fruitAry.put("strawberry", "いちご");
        fruitAry.put("grape", "ぶどう");
        fruitAry.put("muscat", "マスカット");
        fruitAry.put("cherry", "さくらんぼ");
    }

    public void setSearchWord(String givenWord) {
        this.givenWord = givenWord;
    }

    public void searchDic() {
        // 検索語が辞書に含まれているかチェック
        if(fruitAry.containsKey(givenWord)) {
            // 含まれている場合、その意味を表示
            String meaning = fruitAry.get(givenWord);
            System.out.println(givenWord + "の意味は " + meaning + " です。");
        } else {
            // 含まれていない場合、その旨を表示
            System.out.println(givenWord + "は辞書に含まれていません。");
        }

}

}

package kadai_020;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // Dictionary_Chapter20のインスタンスを生成し、辞書を初期化
        Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
        dictionary.fruitDic(); // 辞書にデータをセット

        // 検索したい単語の配列
        String[] searchWords = {"apple", "banana", "grape", "orange"};

        // 配列に含まれる各単語について辞書を検索
        for(String word : searchWords) {
            dictionary.setSearchWord(word); // 検索したい単語を設定
            dictionary.searchDic(); // 辞書を検索し、結果を出力
        }
    }
}

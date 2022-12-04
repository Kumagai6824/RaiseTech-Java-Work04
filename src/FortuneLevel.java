public enum FortuneLevel {

    //enumは英語で作る。
    //最終的には大吉、吉、凶を表示したい。
    EXCELLENT("大吉"),
    GOOD("吉"),
    BAD("凶");

    //フィールド
    private String fortuneName;

    //コンストラクタ
    FortuneLevel(String fortuneName) {
        this.fortuneName = fortuneName;
    }

    //getterを作って、日本語部分を取得したいけど、別クラスでうまくインスタンス化→getter利用ができない。。

}

public class FortuneCooker {
    private final Enum FortuneLevel;
    private final String explanation;
    private String signOff = "良い一日を。";

    public FortuneCooker(Enum FortuneLevel, String explanation) {
        this.FortuneLevel = FortuneLevel;
        this.explanation = explanation;
    }

    public Enum getFortuneLevel() {
        return this.FortuneLevel;
    }

    public void setSignOff(String signOff) {
        this.signOff = signOff;
    }

    //テキストブロックを利用してみる
    public void dispResult() {
        String str = """
                今日のあなた（PC）の運勢は・・・
                                
                         [%1$s]
                --------------------------
                %2$s
                --------------------------
                %3$s
                """.formatted(FortuneLevel, explanation, signOff);  //ForutneLevelはenumの日本語の部分を表示したい。
        System.out.println(str);
    }
}
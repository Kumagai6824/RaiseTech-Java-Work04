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

    public void dispResult() {
        System.out.println
                ("今日のあなた（PC）の運勢は・・・\n\n      " +
                        "[" + FortuneLevel + "]" + "\n" +
                        "------------------------------\n" +
                        explanation + "\n" +
                        "------------------------------\n" +
                        signOff);
    }

}

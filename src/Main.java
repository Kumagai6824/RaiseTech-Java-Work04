import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //おみくじリスト
        List<FortuneCooker> fortuneList = new ArrayList<>();
        fortuneList.add(new FortuneCooker(FortuneLevel.EXCELLENT, "最━━d(●ﾟ∀ﾟ●)b ━━高"));
        fortuneList.add(new FortuneCooker(FortuneLevel.GOOD, "ちゃんと起動するよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.GOOD, "ゲームしてても途中で落ちたりしないよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.GOOD, "セキュリティ、ヨシ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.GOOD, "動画がカクつかないよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.BAD, "Your PC/Device needs to be repaired\nError code:0xc000014c"));

        Random randomIndexNumber = new Random();
        List<FortuneCooker> result = randomIndexNumber.
                ints(1, 0, fortuneList.size()).
                mapToObj(i -> fortuneList.get(i)).toList();

        //おみくじ結果から、Enumの日本語部分を取り出すことはできる。。。
        /*System.out.println("Enum test");
        FortuneLevel fortuneLevelTest = (FortuneLevel) result.get(0).getFortuneLevel();*/

        //おみくじ結果を変数に格納
        FortuneCooker yourFortune = result.get(0);


        System.out.println("<<<WELCOME TO THE FORTUNE COOKER>>>\n");
        if (yourFortune.getFortuneLevel().equals(FortuneLevel.EXCELLENT)) {
            yourFortune.setSignOff("ﾏﾀﾈ―ヾ(●´･∀･`●)―!!");
            yourFortune.dispResult();
        } else if (yourFortune.getFortuneLevel().equals(FortuneLevel.BAD)) {
            yourFortune.setSignOff("(´;д;`)ｳｯ…");
            yourFortune.dispResult();
        } else {
            yourFortune.dispResult();
        }

    }
}

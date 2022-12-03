import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //おみくじリスト
        List<FortuneCooker> fortuneList = new ArrayList<>();
        fortuneList.add(new FortuneCooker(FortuneLevel.大吉, "最━━d(●ﾟ∀ﾟ●)b ━━高"));
        fortuneList.add(new FortuneCooker(FortuneLevel.吉, "ちゃんと起動するよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.吉, "ゲームしてても途中で落ちたりしないよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.吉, "セキュリティ、ヨシ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.吉, "動画がカクつかないよ！"));
        fortuneList.add(new FortuneCooker(FortuneLevel.凶, "Your PC/Device needs to be repaired\nError code:0xc000014c"));

        Random randomIndexNumber = new Random();
        List<FortuneCooker> result = randomIndexNumber.
                ints(1, 0, fortuneList.size()).
                mapToObj(i -> fortuneList.get(i)).toList();

        System.out.println("<<<WELCOME TO THE FORTUNE COOKER>>>\n");
        if (result.get(0).getFortuneLevel().equals(FortuneLevel.大吉)) {
            result.get(0).setSignOff("ﾏﾀﾈ―ヾ(●´･∀･`●)―!!");
            result.get(0).dispResult();
        } else if (result.get(0).getFortuneLevel().equals(FortuneLevel.凶)) {
            result.get(0).setSignOff("(´;д;`)ｳｯ…");
            result.get(0).dispResult();
        } else {
            result.get(0).dispResult();
        }

    }
}

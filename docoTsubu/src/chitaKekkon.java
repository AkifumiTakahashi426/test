import java.util.Random;

public class chitaKekkon {

    public static void main(String[] args) {

        String[] names = {"だいた","ぴよ","ゆすけ","いろは","かなみ","ぽわん"};

        Random rand = new Random();

        int oneNum=-1;
        int twoNum=-1;

        while(oneNum == twoNum) {
         oneNum =rand.nextInt(3);
         twoNum =rand.nextInt(3);
        }

        String oneName = names[oneNum];
        String twoName = names[twoNum];

        System.out.println("今回ぽわんのために結婚式を挙げるのは……");
        System.out.println("["+oneName +"]さんと["+twoName+"]さんです");

    }

}

public class Principal {
    public static void main(String[] args) {
       Zumbi zumbi = new Zumbi();
       int first_play = 130;
       int second_play = 240;
       int third_play = 320;

       int result = zumbi.Totalcalculo(first_play, second_play, third_play);
       int result2 = zumbi.media(first_play, second_play, third_play);
       System.out.println(result);
       System.out.println(result2);

    }
}

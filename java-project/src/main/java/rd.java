
public class rd {
    static String[] names = {
            "김석희", "황지은", "정소현", "오세현", "강성현", "김이든",
            "김다솔", "이보미", "이철희", "김미애", "송우정", "윤효진",
            "김정훈", "심현석", "윤재훈", "이승서", "이해성", "장나성", 
            "김준엽", "박정남", "김지성", "황원철", "장욱진", "민혜린",
            "최명송", "조인성", "서정혁"};



    public static void main(String[] args) throws Exception {
        String[] num = new String[27] ;

        for (int i = 0; i < 27; i++) {
            num[i] = names[(int)(Math.random() * 27)];

            for(int x = 0; x < i; x++) {
                if(num[x]==num[i]) {
                    i--;
                    break;
                } else continue;
            }
        }
      //  for(int i = 10; i > 0; i--)
       // {
        //    Thread.sleep(1000);
        //    System.out.println(i);
       // }
        System.out.println("-------------------------칠판--------------------------\n");

        for(int j = 0; j < 27; j++){
            System.out.print(num[j]+" ");
            Thread.sleep(1000);
            if ((j+1) == 8 || (j+1) == 16 || (j+1) == 23) {
                System.out.println();
            } else if ((j+1) == 23) {
                System.out.print("       ");
            } else continue;
        }
    }
}






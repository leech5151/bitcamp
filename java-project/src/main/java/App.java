


public class App {
   
    
    public static void main(String[] args) {
        
        Score[] scores = {new Score(), new Score(), new Score()};
        
        Score.init(scores[0],"홍길동",100,90,80);
        Score.init(scores[1],"임꺽정",80,90,70);
        Score.init(scores[2],"유관순",100,100,100);
        
        for (Score s : scores) {
            Score.print(s);       
        }
    }
}





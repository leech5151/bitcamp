package bitcamp.java100;


public class Test18_6 {

    public static void main(String[] args) throws Exception {
        String email = "1hong@test.com";
        
        System.out.println(email.matches("1hong@test.com"));
        
        email.matches("알파벳@알파벳.알파벳");
        
        System.out.println(email.matches(".+@.+\\..+"));
        
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        System.out.println("----------------------------------------------------");
        
        String str = "홍길동(hong@test.com),임꺽정(lee@test.com)," +
                    "유관순(yoo@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
        
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        int startIndex = 0 ;
        while (matcher.find()) {
            String matchString = matcher.group();
            startIndex = matcher.start() + matchString.length() ;
            System.out.println(matchString);
        }
    }
}   

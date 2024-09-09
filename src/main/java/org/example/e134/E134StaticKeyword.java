package org.example.e134;
    class H1{
    String s;
    public H1(String s){
        this.s=s;
    }
    public int countVowels(){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }

        }
        return count;
    }
}
public class E134StaticKeyword {
    public static void main(String[] args) {
        H1 h2=new H1("obama");
        H1 h3=new H1("happy friday! i love weekends");
        System.out.println(h2.countVowels());
        System.out.println(h3.countVowels());

    }
}

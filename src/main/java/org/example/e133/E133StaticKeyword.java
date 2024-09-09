package org.example.e133;
class CountLetters{
    String s;
    public CountLetters(String s){
         this.s=s;
    }
    int count=0;
    int countA(){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
}

    public class E133StaticKeyword {
        public static void main(String[] args) {

            CountLetters obj=new CountLetters("aaa");
            CountLetters obj2=new CountLetters("aaBBdf8k3AAadnklA");
            System.out.println(obj.countA());
            System.out.println(obj2.countA());
        }
    }


package com.company;

public class CheckIfTheSentenceIsPangram {

    static boolean isPangram(String s){
        boolean [] ans = new boolean[26];

        for(int i =0; i<s.length(); i++){
            ans[s.charAt(i) - 97] = true;
        }

        for(int j =0; j<26; j++){
            if(ans[j] == false) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String sentence = "bhoomi";
        String sen2 = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(isPangram(sen2));
        System.out.println(isPangram(sentence));
    }
}

package com.company;
import java.util.List;


public class CountItemsMatchingARule {

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        if (ruleKey.equals("type")){
            for(int i = 0; i<items.size(); i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count ++;
                }
            }
        }

        if (ruleKey.equals("color")){
            for(int i = 0; i<items.size(); i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count ++;
                }
            }
        }

        if (ruleKey.equals("name")){
            for(int i = 0; i<items.size(); i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count ++;
                }
            }
        }

        return count;

    }
    public static void main(String[] args) {

 /*       List<List<String>> items = {["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]};
        String [][] it = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String key = "color";
        String value = "silver";

        System.out.println(countMatches(items, key, value));*/

    }
}

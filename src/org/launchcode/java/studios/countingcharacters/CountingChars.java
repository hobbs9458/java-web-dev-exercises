package org.launchcode.java.studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
        //create string
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        //turn into array of characters
        char[] charactersInStr = str.toCharArray();

        //create HashMap to store data
        HashMap<Character, Integer> map = new HashMap<>();

        // create key value pairs in hash map
        for(int i = 0; i < charactersInStr.length; i++) {
            map.put(charactersInStr[i], 0);
        }

        // loop through hash map and check if the key ='s a char in charactersInString
        for(Map.Entry<Character, Integer> keyValuePair : map.entrySet()){
            int count = 0;
            char keyChar = keyValuePair.getKey();
            for(int j = 0; j < charactersInStr.length; j++) {
                if(keyChar == charactersInStr[j]) {
                    count += 1;
                    keyValuePair.setValue(count);
                }
            }
            // print out key value pairs
            System.out.println(keyValuePair.getKey() + ":" + keyValuePair.getValue());
        }
    }
}

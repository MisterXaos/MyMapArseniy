package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {




    public Map<String, Integer> countWordFrequency(String sentence){
        Map<String,Integer> Sort = new HashMap<>();

        if(sentence == null){
            return Sort;
        }
        String[] world = sentence.toLowerCase().split("\\W+");
        for(String word: world){
            if(!word.isEmpty()) {
//                Sort.put(word, Sort.getOrDefault(word,0) +1);
                Sort.put(word, Sort.getOrDefault(word, 0 ) +1);
            }
        }
        return Sort;
    }

}

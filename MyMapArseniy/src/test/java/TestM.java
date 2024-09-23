import org.example.WordFrequency;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestM {
    @Test
    public void test_count_Word_Frequency(){
        WrongThreadException wrongThreadException = new WrongThreadException();
        String sent ="А А А А А world";
        Map<String, Integer> expext1 = new HashMap<>();
        expext1.put("A", 5);
        expext1.put("world",1);
        assertEquals(expext1, wrongThreadException.countWordFrequency());//почему-то не видит метод, хотя по идее он есть
    }

}

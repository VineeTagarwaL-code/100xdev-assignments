package tests;
import solutions.Anagram;


class TestCase {
    String s;
    String t;
    boolean expected;

    public TestCase(String s, String t, boolean expected) {
        this.s = s;
        this.t = t;
        this.expected = expected;
    }
}


public class Anagram_test {
    public static void main(String[] args) {
        TestCase[] testCases = {
            new TestCase("anagram", "nagaram", true),    
            new TestCase("rat", "car", false),          
            new TestCase("listen", "silent", true),     
            new TestCase("hello", "billion", false)    
        };

        System.out.println("Number of test cases: " + testCases.length);

        for (int i = 0; i < testCases.length; i++) {
            TestCase testCase = testCases[i];
            boolean result = Anagram.isAnagram(testCase.s, testCase.t);
            String testResult = result == testCase.expected ? "Pass" : "Fail";
            System.out.println("Test " + (i + 1) + ": " + testResult);
            

        }
    }
}

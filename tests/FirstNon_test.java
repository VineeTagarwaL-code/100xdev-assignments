package tests;
import solutions.FirstNonRepeatingCharacter;
class TestCaseFirstNon {
    String input;
    int expected;

    public TestCaseFirstNon(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }
}
public class FirstNon_test {
    public static void main(String[] args) {
        System.out.println("FirstNonRepeatingCharacter \n");
        TestCaseFirstNon[] testCases = {
            new TestCaseFirstNon("leetcode", 0),       
            new TestCaseFirstNon("loveleetcode", 2),  
            new TestCaseFirstNon("aabb", -1)       
        };
        for (int i = 0; i < testCases.length; i++) {
            TestCaseFirstNon testCase = testCases[i];
            int result = FirstNonRepeatingCharacter.firstNonRepeatingCharacter(testCase.input);
            String testResult = result == testCase.expected ? "Pass" : "Fail";
            System.out.println("Test " + (i + 1) + ": " + testResult);
        }
    }
}

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println("This is my test method.");
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack stc = new Stack();
        boolean validFlag = true;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '('||ch == '{'||ch == '[') {
                stc.push(ch);
            } else if (ch == ')'||ch == '}'||ch == ']') {
                char chPop = getClosingBracket(ch);
                if(stc.empty()) {validFlag = false;}
                else if ((char)stc.peek() == chPop) {
                    stc.pop();
                } else {
                    validFlag = false;break;
                }
            }
        }
        if(!stc.empty()) validFlag = false;
        return validFlag;
    }
    private static char getClosingBracket(char ch) {
        char closeCh = '-';
        switch(ch) {
            case ')': closeCh = '(';break;
            case '}': closeCh = '{';break;
            case ']': closeCh = '[';break;
        }
        return closeCh;
    }
}

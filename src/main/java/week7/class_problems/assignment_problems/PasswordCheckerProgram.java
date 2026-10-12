public class PasswordCheckerProgram {
    static class PasswordChecker { private final String password; PasswordChecker(String password) { this.password = password; } String getStrength() { return password.length() < 6 ? "Weak" : password.length() < 10 ? "Medium" : "Strong"; } }
    public static void main(String[] args) { System.out.println(new PasswordChecker("abcd").getStrength()); System.out.println(new PasswordChecker("abcdefghij").getStrength()); }
}

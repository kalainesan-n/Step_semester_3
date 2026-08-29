

public class TrafficSignalStreakAnalyzer {

    static void analyzeSignal(String signals) {

        int currentStreak = 0;
        int maxStreak = 0;

        for (int i = 0; i < signals.length(); i++) {

            if (signals.charAt(i) == 'G') {
                currentStreak++;

                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }

            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Longest Green Streak: " + maxStreak);
    }

    public static void main(String[] args) {

        analyzeSignal("RRGGGRG");
        analyzeSignal("GGGRRGGGG");
    }
}
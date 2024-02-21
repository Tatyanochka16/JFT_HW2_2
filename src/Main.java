public class Main {
    public static void main(String[] args) {
        float accScore = 100;
        float added = 1205;
        int splitter = 100;
        int bonuses = 0;
        int bonus;
        if (added >= 1000) {
            bonus = (int) added / splitter;
            accScore = accScore + added;
            bonuses = bonuses + bonus;
        } else {
            accScore = accScore + added;
        }
        System.out.println("Your scour = " + accScore);
        System.out.println("Your bonuses = " + bonuses);
    }
}
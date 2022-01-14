public class Main {
    public static void main(String[] args) {
        String day = "Pizza";

        switch (day) {
            case "Sunday" -> System.out.println("It is Sunday");
            case "Monday" -> System.out.println("It is Monday");
            case "Tuesday" -> System.out.println("It is Tuesday");
            case "Wednesday" -> System.out.println("It is Wednesday");
            case "Thursday" -> System.out.println("It is Thursday");
            case "Friday" -> System.out.println("It is Friday");
            case "Saturday" -> System.out.println("It is Saturday");
            default -> System.out.println("That is not a day!");
        }
    }
}

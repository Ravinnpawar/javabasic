//It is a special data type which contains fixed set of constants.
//It improves the type safety.
//easy to use with switch condition.
public class EnumExample {
    public static void main(String[] args) {
        for (WeekDays w: WeekDays.values()){
            System.out.println(w);
            if ((w.toString()).equals("SUN")){
                System.out.println("Today is Sunday and its holiday");
            }
        }
    }
}

public class CalendarConverter {
    public static final int PONIEDZIALEK = 1;
    public static final int WTOREK = 2;
    public static final int SRODA = 3;
    public static final int CZWARTEK = 4;
    public static final int PIATEK = 5;
    public static final int SOBOTA = 6;
    public static final int NIEDZIELA = 7;


    public static String convertDayToString(int dayNumber) {
        String result;

        switch (dayNumber) {
            case PONIEDZIALEK:
                result = "Poniedzialek";
                break;

            case WTOREK:
                result = "Wtorek";
                break;

            case SRODA:
                result = "Sroda";
                break;

            case CZWARTEK:
                result = "Czwartek";
                break;

            case PIATEK:
                result = "Piątek";
                break;

            case SOBOTA:
                result = "Sobota";
                break;

            case NIEDZIELA:
                result = "Niedziela";
                break;

            default:
                result = "BŁAD!";

        }
        return result;
    }


}

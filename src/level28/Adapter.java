package level28;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Адаптация нескольких интерфейсов
*/

public class Adapter {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        StringBuilder phoneNumber = new StringBuilder(String.valueOf("501234567"));
        while(phoneNumber.length() != 10){
            phoneNumber.insert(0, "0");
        }
        System.out.println(phoneNumber);
        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(phoneNumber.toString());
        System.out.println(matcher.matches());
        String result = String.format("+%s(%s)%s-%s-%s", "38", matcher.group(1), matcher.group(2), matcher.group(3),matcher.group(4)); //+38(050)123-45-67
        System.out.println(result);
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactFirstName(), data.getContactLastName());
        }

        @Override
        public String getPhoneNumber() {
            StringBuilder phoneNumber = new StringBuilder(data.getPhoneNumber());
            while (phoneNumber.length() != 10) {
                phoneNumber.insert(0, "0");
            }
            Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                return String.format("+%s(%s)%s-%s-%s",
                        data.getCountryPhoneCode(),
                        matcher.group(1),
                        matcher.group(2),
                        matcher.group(3),
                        matcher.group(4)); // +38(050)123-45-67
            } else {
                throw new IllegalArgumentException("Неверный формат номера телефона");
            }
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            if (countries.containsKey(data.getCountryCode())) {
                return countries.get(data.getCountryCode());
            }
            return "Unknown";
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}
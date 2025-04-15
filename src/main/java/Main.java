import com.skandinavia.service.DailyInterestService;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyInterestService dailyInterestService = new DailyInterestService();
        DecimalFormat df = new DecimalFormat("000000.00");

        System.out.println(df
                .format(dailyInterestService
                .calculateDailyReturn(1000000.00, dailyInterestService.getDailyInterestConversion())));

        List<String> names = Arrays.asList("Daniel", "Ana", "Salomon", "Karelyz", "Karelyz");
        names.stream()
                .distinct()


        System.out.println(names);

    }
}

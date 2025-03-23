package formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    private static final NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("tr", "TR"));

    public static String formatCurrency(BigDecimal value) {
        String formattedValue = currencyFormatter.format(value);
        return formattedValue.replace("₺", "").trim() + " TL";
    }
}

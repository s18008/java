import java.math.BigDecimal;
import java.math.RoundingMode;

public class En5_4{
public static void main(String[] args){
BigDecimal a = new BigDecimal("1");
BigDecimal b = new BigDecimal("9");
BigDecimal c = a.divide(b,4,RoundingMode.HALF_UP);
BigDecimal d = c.multiply(b);
System.out.println(d);
}

}

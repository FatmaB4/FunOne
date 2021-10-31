import static java.lang.System.*;

public class FunOne
{
	public static int countEvenDigits(int num)
	{
 if (num == 0) {
 return 0;
 }
    int lastDigit = num % 10;
    int remainingtDigits = num / 10;
    if (lastDigit % 2 == 0) {
        return 1 + countEvenDigits(remainingtDigits);
    } else {
        return  countEvenDigits(remainingtDigits);
    }
	}
}
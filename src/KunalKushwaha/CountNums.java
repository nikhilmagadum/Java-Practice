package KunalKushwaha;

public class CountNums {
    static void main(String[] args) {
        int n = 455556;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if( rem == 5) {
                count++;
            }
            n = n / 10 ;             // n /= 10; --> this is the shorcut method
        }
        System.out.println(count);
    }
}

package seleniumHomework1;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int num = 5;

        System.out.println("Initial value of num: " + num);

        // Pre-increment
        int preInc = ++num;  // num increases first, then assigned
        System.out.println("After pre-increment (++num): num = " + num + ", returned = " + preInc);

        // Post-increment
        int postInc = num++; // value assigned first, then increases
        System.out.println("After post-increment (num++): num = " + num + ", returned = " + postInc);

        // Pre-decrement
        int preDec = --num;  // num decreases first, then assigned
        System.out.println("After pre-decrement (--num): num = " + num + ", returned = " + preDec);

        // Post-decrement
        int postDec = num--; // value assigned first, then decreases
        System.out.println("After post-decrement (num--): num = " + num + ", returned = " + postDec);

        System.out.println("\nFinal value of num: " + num);
    }
}

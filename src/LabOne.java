public class LabOne {
    public static void main(String[] args) {
        //variables
        int intOperandA = 9;
        int intOperandB = 3;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 9.5;
        double doubleOperandB = 3.7;
        double doubleSum;
        double doubleDifference;
        double doubleProduct;
        double doubleQuotient;
        double doubleModulo;

        //process
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //outputs
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB +  " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB +  " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB +  " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB +  " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB +  " is " + intModulo);

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleModulo);



    }
}
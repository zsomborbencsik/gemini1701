import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String question  = sc.next();

        System.out.println();

    }

    static int Calcula(String operation, int operand1, int operand2){
        int result = 0;

        if(operation=="+"){
            result=operand1+operand2;
        }if(operation=="-"){
            return operand1-operand2;
        }if(operation=="*"){
            return operand1*operand2;
        }if(operation=="/"){
            return operand1/operand2;
        }if(operation=="%"){
            return operand1%operand2;
        }
        return result;
    }

}


// Create a simple calculator application which reads the parameters from the prompt

// and prints the result to the prompt.

// It should support the following operations:

// +, -, *, /, % and it should support two operands.

// The format of the expressions must be: {operation} {operand} {operand}.

// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)



// You can use the Scanner class

// It should work like this:



// Start the program

// It prints: "Please type in the expression:"

// Waits for the user input

// Print the result to the prompt

// Exit
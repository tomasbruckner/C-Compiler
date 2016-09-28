/* Program 1: Iterative Factorial Computation */
int main(void) { // Program Main function
    int a, res;
    print("Enter an integer to compute its factorial:");
    a = read_int();
    if (a < 0) {
        print("\nFactorial of a negative integer is undefined!\n");
    }
    else{
        res = 1;
        while (a > 0) {
            res = res * a;
            a = a - 1;
        } // endwhile
        print("\nThe result is: ", res, "\n");
    } // endif
} // main
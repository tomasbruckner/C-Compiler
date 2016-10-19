// specification test 2

/* Program 2: Recursive Factorial Computation */
int factorial (int);
int main(void) {
    int a; int res;
    print("Enter an integer to compute its factorial:");
    a = read_int();
    if (a < 0){
        print("\nFactorial of a negative integer is undefined!\n");
    }
    else{
        print("\nThe result is: ", factorial(a), "\n");
    }
}
int factorial (int n){
    int decremented_n, temp_result;
    if (n < 2){
        return 1;
    }
    else{
        decremented_n = n - 1;
        temp_result = factorial(decremented_n);
    }
    return (int)n * temp_result;
} // end of factorial

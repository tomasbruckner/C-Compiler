// Undefined variable in function expression

int function (int a, int b) {
    return a;
}

int main(void) {
    int x;
    x = function(a, 5);
}
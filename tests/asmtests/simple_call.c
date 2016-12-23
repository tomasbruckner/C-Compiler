int function (int, int);

int function (int a, int b) {
    a = a + b;
    print_string("function a: ");
    print_int(a);
    print_string("\n");
    return a;
}

int main(void) {
    int x;
    x = 3 * 5 - 1 >= 5;
    print_string("main x: ");
    print_int(x);
    print_string("\n");
    x = function(x, 5);
    print_string("main x: ");
    print_int(x);
    print_string("\n");
    return x;
}
	
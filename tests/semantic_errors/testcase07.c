// mismatch between parameters in declaration and definition nonmain function

int main(void);

int main(void) {
    return 3;
}

void foo(string, int);

void foo(string x, string y) {
    return;
}
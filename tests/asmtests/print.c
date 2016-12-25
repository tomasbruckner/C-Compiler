// print

int foo(void) {
    return 2;
}

int main(void) {
    int x;
    string y;
    char d;
    print(x,y,d,4,"abc", foo(), (char) foo(), 'a');
}
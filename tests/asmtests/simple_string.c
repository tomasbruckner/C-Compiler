int main(void) {
    string a, b;
    a = read_string();
    b = read_string();
    print_string(a);
    print_string(b);

    string s, mod;
    s = "Hello\tworld!";
    mod = set_at(s, 5, 'n');
    print_string(s);
    print_string(mod);

    return 42;
}
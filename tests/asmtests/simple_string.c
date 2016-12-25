string getString(void) {
    return "returned";
}


int main(void) {
    string a, b;
    a = read_string();
    b = read_string();
    print(a, ' ', b, '\n');

    string s, mod;
    s = "Hello\tworld!";
    mod = set_at(s, 5, 'n');
    print(s, " ", mod, '\n');

    print(getString(), '\n');

    return 42;
}
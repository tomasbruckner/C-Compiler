int main(void) {
	string s, mod;
	s = "Hello World!";

	print_string(s);
	print_char('\n');
	mod = set_at(s, 11, '?');
	print_string(s);
	print_char('\n');
	print_string(mod);
	print_char('\n');

	return 0;
}
int main(void) {
	int i;
	char c;
	string s;

	i = 65;
	c = (char) i;
	print_char(c);

	s = (string) c;
	print_string(s);

	return 0;
}
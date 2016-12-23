int main(void) {
	string s1, s2;
	s1 = read_string();
	s2 = read_string();

	char c;
	c = get_at(s1, 0);
	print_char(c);
	print_char('\t');
	c = get_at(s2, 1);
	print_char(c);
	print_char('\n');

	return 0;
}
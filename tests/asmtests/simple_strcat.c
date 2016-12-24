int main(void) {
	string s1, s2, s;
	// s1 = "Hello ";
	// s2 = "World!";
	s1 = read_string();
	s2 = read_string();

	s = strcat(s1, s2);
	print_string(s);
	print_char('\n');

	return 0;
}
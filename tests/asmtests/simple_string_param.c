void change(string s) {
	s = set_at(s, 0, 'X');
	print_string(s);
	print_char('\n');	
}

int main(void) {
	string s;
	s = "Hello World!";
	print_string(s);
	print_char('\n');
	change(s);
	print_string(s);
	print_char('\n');

	return 0;
}
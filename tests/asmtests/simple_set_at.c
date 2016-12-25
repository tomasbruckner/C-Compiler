int main(void) {
	string s, mod;
	s = "Hello World!";

	print(s, '\n');
	mod = set_at(s, 11, '?');
	print(s, '\n', mod, '\n');
	
	return 0;
}
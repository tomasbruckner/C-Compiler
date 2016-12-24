int main(void) {
	int x;
	x = 1;
	
	print_string("x: ");
	print_int(x);
	print_char('\n');

	if (1) {
		int x;
		x = 10;

		print_string("x: ");
		print_int(x);
		print_char('\n');
	}
	else {
		print_string("unreachable\n");
	}

	print_string("x: ");
	print_int(x);
	print_char('\n');
}
int main(void) {
	int x, y;
	x = 1;
	y = 2;
	
	print_string("x: ");
	print_int(x);
	print_char('\n');

	print_string("y: ");
	print_int(y);
	print_char('\n');

	if (1) {
		int x;
		x = 10;

		x = x + 1;
		y = y + 1;

		print_string("x: ");
		print_int(x);
		print_char('\n');

		print_string("y: ");
		print_int(y);
		print_char('\n');		
	}
	else {
		print_string("unreachable\n");
		int x;
		x = 42;
	}

	print_string("x: ");
	print_int(x);
	print_char('\n');

	print_string("y: ");
	print_int(y);
	print_char('\n');
}
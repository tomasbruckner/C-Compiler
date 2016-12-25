void funcVoid(void) {
	return;
}


int func(int x) {
	int res;

	if(x > 5) {
		res = 100;
		return res;
	}
	else {
		res = 300;
		return res;
	}
}


int main(void) {
	int c, res;

	c = 5;

	funcVoid();

	if (c == 5) {
		res = func(10);
	}
	else {
		res = func(0);
	}

	return res;
}
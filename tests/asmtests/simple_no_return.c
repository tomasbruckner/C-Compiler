int funcA(int x) {
	x = x + 1;
	return 1;
	x = x + 1;
}

int funcB(void) {
}

int funcC(void) {
	return 1234;
}

string funcD(void) {

}


int main(void) {
	print(funcA(1), '\n', funcB(), ' ', funcC(), " ", funcD());
}
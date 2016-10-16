// mismatch return type definition and declaration nonmain function

int main(void);
char Main(void);

string Main(void){
    return "a";
}


int main(void){
    return 2;
}


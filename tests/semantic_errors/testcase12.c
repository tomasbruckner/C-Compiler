// declaration after definition non main function

void foo(int) {
    return;
}

void foo(int);

int main(void){
    return 3;
}

int main(void);
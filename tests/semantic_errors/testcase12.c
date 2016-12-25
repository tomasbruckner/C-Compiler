// declaration after definition non main function

void foo(int x) {
    return;
}

void foo(int);

int main(void){
    return 3;
}

int main(void);
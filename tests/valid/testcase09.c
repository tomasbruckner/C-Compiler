// implicit return value

int foo(void){

}

int main(void){
    if(foo() == 0){
        print("OK");
    }
    else {
        print("NOT OK");
    }
}
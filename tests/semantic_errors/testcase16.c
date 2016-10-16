// undefined variable in block

int main(void){
    int y;
    if(2) {
        int x;
        x = 3;
    }
    else {
    }
    y = y + x;

    return 2;
}
/* Program 3: Program using Strings and Embedded Functions */
int main(void) {
    string str1, str2;
    int p; char zero;
    str1 = "This is some text";
    str2 = strcat(str1, " that can be a little longer.");
    print(str1, '\n', str2, "\n");
    str1 = read_string();
    while ((int)(get_at(str1, p)) != 0){
        p = p + 1;
    }
    print("\nThe length of \"", str1, "\", is ", p, " characters.\n");
}

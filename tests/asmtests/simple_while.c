    int main(void) {
        int r;
        int c;
        c = 5;
        // nedefinovane promenne nefunguji
        r = 0;

        while (c > 0)
        {
            // pro vysledek se pouzije novy registr, ale to je jen temp hodnota, potom se presune do spravneho registru
            // je to neefektivni, ale asi spravne
            r = r + 1;
            c = c - 1;
        }

        return r;
    }
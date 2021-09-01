#include <fstream>
#include <cstdlib>
#include <ctime>
#include <cmath>
#include <iostream>

using namespace std;

int main() {
    ifstream fin("ex6_file.txt");
    while(true) {
        if(fin.eof())
            break;
        int count = 1;
        float f1, f2;
        char c;
        fin >> f1;
        fin >> c;
        fin >> f2;
        if(round((f2/f1)*100) == 18)
            cout << count++ << ".true\n";
        else
            cout << count++ << ".false\n";

    }
    fin.close();
}

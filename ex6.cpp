#include <fstream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

int main(int argc, char* argv[]) {
    ofstream fout("ex6_file.txt");
    ifstream* fin;
    if(argc == 2)
     fin = new ifstream(argv[1]);
    else
        fin = new ifstream("ex5_file.txt");
    while(true) {
        float f;
        (*fin) >> f;
        fout << f << ";" <<round(f*18)/100 << endl;

        if((*fin).eof())
            break;
    }
    (*fin).close();
    fout.close();
    delete fin;
}

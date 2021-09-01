#include <fstream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

int main() {
    srand(time(0));
    ofstream file("ex5_file.txt");
    for(int i = 0; i < 100; ++i) {
        float r = static_cast <float> (rand()) / (static_cast <float> (RAND_MAX/100));
        r = round(r*100)/100;
        file << r << endl;
    }
    file.close();
}

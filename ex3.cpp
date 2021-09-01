#include <iostream>
#include <cstdlib>
#include <ctime>
#define unsigned int u_int;
using namespace std;

void fill_arr(u_int* arr, size_t s) {
    cout << "________________Array " << s << " size: " << endl;
    u_int zero = 0;
    u_int one = 0;
    for(size_t sz = 0; sz < s; ++sz) {
        arr[sz] = rand() % 2;
        if(arr[sz] == 0)
            ++zero;
        else
            ++one;
        cout << arr[sz] << " ";

    }
    cout << endl << "Number of zero: " << zero << endl;
    cout << "Number of one: " << one << endl;
    cout << "zero/one: " << ((double)zero)/one << endl << "______________________________________________________________";
}

int main() {
    srand(time(0));
    u_int arr_100[100];
    u_int arr_1000[1000];
    u_int arr_10000[10000];

    fill_arr(arr_100, 100);
    fill_arr(arr_1000, 1000);
    fill_arr(arr_10000, 10000);

}


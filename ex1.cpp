#include <iostream>
#include <cstdlib>
#include <ctime>
#define usgigned int u_int
using namespace std;

int main() {
    u_int arr[100];
    srand(time(0));

    for(int i = 0; i < 100; ++i) {
        arr[i] = rand() % 100;
    }

    u_int min = arr[0];
    u_int i_min = 0;
    u_int max = arr[0];
    u_int i_max = 0;

    for(int i = 0; i < 100; ++i) {
        if(min > arr[i]) {
            min = arr[i];
            i_min = i;
        }
        if(max < arr[i]) {
            max = arr[i];
            i_max = i;
        }
    }

    cout << "min = " << min << ", arr[" << i_min << "] = " << arr[i_min] << endl;
    cout << "max = " << max << ", arr[" << i_max << "] = " << arr[i_max] << endl;
    cout << "_______________________ array:" << endl;
    for(int i = 0; i < 100; ++i)
        cout << arr[i] << endl;

}

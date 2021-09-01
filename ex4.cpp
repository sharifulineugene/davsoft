#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
using namespace std;

void print_arr(int* arr, size_t s);
int init_arr(int* arr);

int main() {
    srand(time(0));
    int arr[100];
    int count = init_arr(arr);
    int neg[count];
    int pos[100-count];

    int p_count = 0;
    int n_count = 0;
    for(int i = 0; i < 100; ++i) {
        if(arr[i] < 0)
            neg[n_count++] = arr[i];
        else
            pos[p_count++] = arr[i];
    }

    print_arr(arr, 100);
    print_arr(neg, count);
    print_arr(pos, 100-count);
}

int init_arr(int* arr) {
    int count{0};
    for(int i = 0; i < 100; ++i) {
        arr[i] = rand();
        arr[i] *= pow(-1,rand() % 2);
        if (arr[i] < 0)
            ++count;
    }
    return count;
}

void print_arr(int* arr, size_t s) {
    cout << "___________array of " << s << " elements: __________________________________________\n";
    for(size_t size = 0; size < s; ++size) {
        cout << arr[size] << endl;
    }
    cout << "__________end of array\n";
}

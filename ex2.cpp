#include <iostream>
#include <cstdlib>
#include <ctime>
#include <vector>
#include <iterator>
#define usgigned int u_int
using namespace std;

int main() {
    u_int arr[100];
    srand(time(0));
    vector<u_int> bigs;
    u_int count[6] = {0,0,0,0,0,0};

    for(int i = 0; i < 100; ++i) {
        arr[i] = rand() % 2000000;
        cout << arr[i] << endl;

        if(arr[i] < 11)
            ++count[0];
        else if(arr[i] < 101)
            ++count[1];
        else if(arr[i] < 1001)
            ++count[2];
        else if(arr[i] < 10001)
            ++count[3];
        else if(arr[i] < 100001)
            ++count[4];
        else if(arr[i] < 1000001)
            ++count[5];
        else
            bigs.push_back(arr[i]);
    }

    cout << "numbers in the rage 0-10 : " << count[0] << endl;
    cout << "numbers in the rage 11-100 : " << count[1] << endl;
    cout << "numbers in the rage 101-1000 : " << count[2] << endl;
    cout << "numbers in the rage 1001-10000 : " << count[3] << endl;
    cout << "numbers in the rage 10001-100000 : " << count[4] << endl;
    cout << "numbers in the rage 100001-1000000 : " << count[5] << endl;

    ostream_iterator<u_int> out(cout, " ");
    cout << "numbers are greater than 1000000: ";
    copy(bigs.begin(), bigs.end(), out);





}

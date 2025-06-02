#include <iostream>
using namespace std;
void selectionSort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int smallindex = i;
        for (int j = i+1; j < n; j++)
        {
            if (arr[j] < arr[smallindex])
            {
                smallindex = j;
            }
        }
        swap(arr[i], arr[smallindex]);
    }
}
void pr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << "  ";
    }
    cout << endl;
}
int main()
{
    int n = 5;
    int arr[] = {5, 7, 9, 8, 1};

    selectionSort(arr, n);
    pr(arr, n);
}
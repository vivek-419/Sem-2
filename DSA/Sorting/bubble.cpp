#include<iostream>
using namespace std;
void bub(int arr[], int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if (arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
        }
    }
}
void pr(int arr[], int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<"  ";

    }
    cout<<endl;
}
int main(){
    int n=5;
    int arr[]={5,7,9,8,1};

    bub(arr,n);
    pr(arr,n);
}
#include<bits/stdc++.h>

using namespace std;



int main()

{
    int n,a;

    while(cin>>n&&n!=0){
    int sz=__builtin_ctz(n);
    cout<<pow(2,sz)<<endl;
    }
}

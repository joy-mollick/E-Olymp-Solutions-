#include<bits/stdc++.h>

using namespace std;

int main()

{
    long n;
    while(scanf("%ld",&n)!=EOF)
    {
        string s=bitset<32>(n).to_string();
        bool ok=false;
        for(int i=0;i<32;i++)
        {
            if(s[i]=='1') ok=true;
                if(ok) cout<<s[i];
        }
        if(!ok) cout<<"0";
        cout<<endl;
    }
    return 0;
}

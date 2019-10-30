#include<bits/stdc++.h>

using namespace std;

bool great(const int a,const int b)
{
   if(a%10!=b%10)
   {
       return(a%10<b%10);
   }
   else return (a<b);
}

int main()

{
    int tc,a;
    cin>>tc;
    vector<int>v;
    for(int i=0;i<tc;i++)
    {
       cin>>a;
       v.push_back(a);
    }
   sort(v.begin(),v.end(),great);
    for(int i=0;i<tc;i++)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}

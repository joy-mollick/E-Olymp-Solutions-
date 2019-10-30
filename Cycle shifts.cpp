#include<bits/stdc++.h>

using namespace std;

deque<int>d;
int ans=0;

void binary(int n)
{
    while(n)
    {
        if(n%2==0) d.push_back(0);
        else d.push_back(1);
        n=n>>1;
    }
    reverse(d.begin(),d.end());
}

int decimal()
{
    int ans=0;
    int sz=d.size()-1;
    for(int j=d.size()-1;j>=0;j--)
    {
        if(d[j]==1)
        ans+=pow(2,sz-j);
    }
    return ans;
}

int main()

{
    int n;
    cin>>n;
    map< deque<int>,int >m;
    deque<int>variable;
    binary(n);
    m[d]=1;
    ans=n;
    while(true)
    {
        int fr=d.front();
        d.pop_front();
        d.push_back(fr);
        ans=max(ans,decimal());
        if(m[d]==1) break;
        else m[d]=1;
    }
    cout<<ans<<endl;
    return 0;
}

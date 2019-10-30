#include<bits/stdc++.h>

using namespace std;

struct
{
    int h,m,se,total;
}s[101];


int main()

{
    int tc,h,m,se;
    int i;
    cin>>tc;
    for( i=0;i<tc;i++)
    {
        cin>>h>>m>>se;
        s[i].h=h;
        s[i].m=m;
        s[i].se=se;
        s[i].total=h*3600+m*60+se;
    }
    for(int i=0;i<tc;i++)
    {
        for(int j=0;j<tc;j++)
        {
            if(s[i].total<s[j].total)
            {
                swap(s[i].h,s[j].h);
                swap(s[i].m,s[j].m);
                 swap(s[i].se,s[j].se);
                  swap(s[i].total,s[j].total);
            }
        }
    }
    for(int i=0;i<tc;i++)
    {
        cout<<s[i].h<<" "<<s[i].m<<" "<<s[i].se<<endl;
    }
}

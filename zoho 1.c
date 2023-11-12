/*
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/

#include <stdio.h>
#include<string.h>
int main()
{

    int rep=0;
    char a[100],ch;
    scanf("%s",a);
    int l=strlen(a);
    for(int i=0;i<l;i++){
        if(a[i]>='0' && a[i]<='9'){
            rep=rep*10+(a[i]-'0');
            if(i==l-1){
                goto a;
            }
        }else if(a[i]>'9' && rep>0){
            a:
            for(int j=0;j<rep;j++){
                printf("%c",ch);
            }
            rep=0;
        }
        if(a[i]>'9'){
            ch=a[i];
        }
            
    }
    return 0;
}

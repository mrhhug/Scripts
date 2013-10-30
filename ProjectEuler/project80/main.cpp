/* 
 * File:   main.cpp
 * Author: michael
 *
 * Created on November 7, 2012, 2:13 AM
 */

#include <cstdlib>
#include <stdio.h>
#include <math.h>
#include <float.h>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) 
{
    long double r;

        r = sqrt(2.0L);
        printf("Precision: %d digits; %.*Lg\n",LDBL_DIG,LDBL_DIG,r);

        return 0;
}
double sqrt(double num)
{
    double mod=1;
    double c=0;

    for(int d=0; d<50; c+=mod, d++)
    if(c*c>num)
    {
        c-=mod;
        mod/=10;
    }
    
    return c;
}


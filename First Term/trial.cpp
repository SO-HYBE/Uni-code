#include<iostream>
#include<conio.h>
using namespace std;

//student structure
struct student
{int id;
float gpa;
char gen;
};

// create array of strucure student
student y[3];

// read function that read id, gpa, gender of 10 students and store them in structure y
void read_data()
{
for(int i=0;i<=2;i++)
{ cout<<"enter id,gpa and gender of student"<<i+1<<"\n";
 cin>>y[i].id;
 cin>>y[i].gpa;
 cin>>y[i].gen;
 }
}
//sort function that sort 10 students in decending according their gpa
void sort_data()
	
{ 
	int i,j,loc,t1;
float t,max;
 char t2;

 for(i=0;i<=1;i++)
 {max=y[i].gpa;
	 loc=i;
  
  for(j=i+1;j<=2;j++)
  {if( y[j].gpa>=max)
   { max=y[j].gpa;
    loc=j;}
    }
  //swap id
   t1=y[i].id;
    y[i].id=y[loc].id;
    y[loc].id=t1;
//swap gpa
    t=y[i].gpa;
    y[i].gpa=y[loc].gpa;
    y[loc].gpa=t;
//swap gender
     t2=y[i].gen;
    y[i].gen=y[loc].gen;
    y[loc].gen=t2;
	}
}
// function print that print the student structure data
void print_data()
   { for(int i=0;i<=2;i++)

    {cout<<"The sorted students are \n"<<y[i].id<<"\t"<<y[i].gpa<<"\t"<<y[i].gen<<"\n";}
    
}

// function that find the id of highest gpa for male and female
void highestmale_female()
{
int i,max_id_male,max_id_female;
float maxm=0,maxf=0;


for(i=0;i<=2;i++)
 { if(y[i].gen=='m')
     {
      if(y[i].gpa>=maxm)
        {maxm=y[i].gpa;
        max_id_male=y[i].id;
        }
     }
     else
     if(y[i].gen=='f')
     { 
      if(y[i].gpa>=maxf)
        {maxf=y[i].gpa;
        max_id_female=y[i].id;
        }
     }
   }
   cout<<" \nhighest male id"<<max_id_male<<" \n   highest id female"<< max_id_female;
 
}
//fuction that print the average gpa for only males
void averagegpamales()
{       int count=0;
float  sum_gba=0,aver_gba;

       for(int i=0;i<=2;i++)
       {  if(y[i].gen=='m')

          {sum_gba=sum_gba+y[i].gpa;
          count++;
          }

       }


        aver_gba= sum_gba/count ;
        cout<<"\n average gpa for males="<<aver_gba;
       
}

int main()
{
read_data();
sort_data();
print_data();
highestmale_female();
averagegpamales();
getch();
	return 0;

}

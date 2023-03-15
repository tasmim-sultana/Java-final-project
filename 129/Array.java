class Array
{
public static void main(String args[])
{
int []a={12,23,34,45,56,67};
System.out.println(a[2]+ " "+a[5]);
for(int temp: a)
{
System.out.println(temp);
}
int []x= new int[5];
x[2]=99;
x[4]=89;
for(int temp2: x)
{
System.out.println(temp2);
} 
String []y=new String[5];
 y[2]="One";
 y[3]="two";
for(String temp: y)
{
System.out.println(temp);
}

}
}

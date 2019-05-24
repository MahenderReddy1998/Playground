import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int index = 0; index < n; index++)
{
arr[index] = sc.nextInt();
}

int c=1;
int sum = arr[0] + arr[1] + arr[2];
for(int index = 3; index <= n-1 ; index = index + 3) {
int sum1 = arr[index] + arr[index + 1] + arr[index + 2];
if(sum1 != sum)
{
c=0;
}
}
if(c==1)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}
}
}
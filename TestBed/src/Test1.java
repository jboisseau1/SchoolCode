
public class Test1 {
public static void main(String [] arg){
	int sum=0,i,j;
	i=1;
	while(i*i <= 16){
		j=i;
		while(j*j <= 64){
			sum=i+j;
			System.out.println("I="+i+"J="+j+"sum="+sum);
			j=j*2;
		}

	i++;
	}
	
}
}

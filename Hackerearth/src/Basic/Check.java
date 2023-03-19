apackage Basic;
import java.io.*;
//import java.util.LinkedHashMap;
import java.util.*;
public class Check {
public static void main(String[] args) throws IOException {
	FileReader f= new FileReader("C:\\Users\\HP\\eclipse-workspace\\Hackerearth\\src\\Basic\\Amiti.java");
		//FileReader f=new FileReader("C:\\Eclipse\\j1\\j1\\chuti.java");
		BufferedReader br=new BufferedReader(f);
		String s="";
		int i;
		while ((i=br.read())!=-1)
			s+=br.readLine();			
		String sar[]=s.split(" ");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		for (int j = 0; j <sar.length; j++)
			map.put(sar[j],map.getOrDefault(sar[j],0)+1);
		String res[]= {"","",""};
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			if(e.getKey().equals("num1"))
				res[0]+="num1"+'-'+'>'+e.getValue()+'-'+'>';
			if(e.getKey().equals("num2"))
				res[1]+="num2"+'-'+'>'+e.getValue()+'-'+'>';
			if(e.getKey().equals("sum"))
				res[2]+="sum"+'-'+'>'+e.getValue()+'-'+'>';
		}
		boolean n1flag = false,n2flag = false,sumflag = false;
		for (int j = 0; j < sar.length; j++) {
			if(sar[j].equals("num1")&&!n1flag) {
				res[0]+=sar[j-1];
				n1flag=true;
			}	
			else if(sar[j].equals("num2")&&!n2flag) {
				res[1]+=sar[j-1];
				n2flag=true;
			}
			else if(sar[j].equals("sum")&&!sumflag) {
				res[2]+=sar[j-1];
				sumflag=true;
			}	
		}
		for (String string : res)
			System.out.println(string);
	}
}

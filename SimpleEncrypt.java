
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleEncrypt {
	
	
	public static Stack<Queue<Character>> readSentences(String fileName)
	{
		   Stack <String> s1= new LinkedStack <String>();
		   Stack <Queue<Character>> s2= new LinkedStack <Queue<Character>>();


		try {

				Scanner read =new Scanner(new File(fileName));
				
				  while(read.hasNextLine()) {
				    	 s1.push(read.nextLine());
				    	 
				     }
					read.close();
		
	}
		catch(IOException e) {
			return null;

		}
	catch(Exception e) {
	return null;

	}
		while(!s1.empty()) {
	String a=s1.pop();
int b=	a.length();
		 Queue<Character> q=new ArrayQueue(b);
	for(int i =0;i<b;i++)
		q.enqueue(a.charAt(i));
	s2.push(q);
		}


	return s2;
		}
	
	
	public static void encrypt(Queue<Character> q, int k) {
		
		   Stack <Character> f = new LinkedStack <Character>();

		int s=q.length();
		int w=0;
		Character[] c= new Character [s];
	for(int i=0;i<s/k;i++) {
			w =q.multiServe(c,k);
			f.multiPush(c,w);

		while(!f.empty())
	q.enqueue(f.pop());
	}
	int e=q.multiServe(c,s%k);
	f.multiPush(c,e);
	while(!f.empty())
	q.enqueue(f.pop());
	}
	
	 public static void decrypt(Queue<Character> q, int k) {
		 
		 encrypt(q,k);
		 
	 }
	public static void encrypt(Stack<Queue<Character>> st, int k)
	{
		   Stack <Queue<Character>> h = new LinkedStack <Queue<Character>>();
	while(!st.empty()) {
		   Queue<Character> qw=   st.pop();

		encrypt(qw,k)	;
		h.push(qw);
			}
	while(!h.empty())
		st.push(h.pop());
	}
	
	 public static void decrypt(Stack<Queue<Character>> st, int k) {
		 encrypt(st,k);
		 
		 
	 }
	 
	}


		




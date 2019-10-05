



public class ArrayQueue<T> implements Queue<T>{
	private int maxsize;
	private int size;
	private int head, tail;
	private T[] nodes;

	/** Creates a new instance of ArrayQueue */
	public ArrayQueue(int n) {
		maxsize = n;
		size = 0;
		head = tail = 0;
		nodes = (T[])new Object[n];
	}


	public boolean full () {
		return size == maxsize;
	}
	
	public int length () {
		return size;
	}

	
	
	public T serve () {
		T e = nodes[head];
		head = (head + 1) % maxsize;
		size--;
		return e;
	}




public void enqueue(T e) {
	nodes[tail] = e;
	tail = (tail + 1) % maxsize;
	size++;
}

public int multiEnqueue(T els[], int k)
{
	int l=0;
	for(int i=0;i<k;i++) {
		if(!full()) {
		nodes[tail]=els[i];
		tail=(tail+1)%maxsize;
		l++;
		size++;
	}
		else	break;
	}
	return l;
}
public int multiServe(T els[], int k) {

int l=0;
	int x=k;
	for(int i=0;i<k;i++) {
		if(size!=0) {
		els[i]=nodes[head];
		head=(head+1)%maxsize;
		l++;
		x--;
		size--;
	}
		else 	break;
	}
	
	return l;
}
	/*
int l=0;
	int x=k;
	for(int i=0;i<k;i++) {
		if( size!=0 && x<=size&&x<els.length) {
		els[i]=nodes[head];
		head=(head+1)%maxsize;
		l++;
		x--;
		size--;
	}
		else 	break;
	}
	
	return l;
}
*/
	
}
	


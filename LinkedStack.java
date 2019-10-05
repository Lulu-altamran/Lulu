
public class LinkedStack<T> implements Stack<T> {
	private Node<T> top;

	/* Creates a new instance of LinkStack */
	public LinkedStack() {
		top = null;
	}

	
	public boolean empty(){
		return top == null;
	}
	
	public boolean full(){
		return false;
	}


	public void push(T e){
		Node<T> tmp = new Node<T>(e);
		tmp.next = top;
		top = tmp;
	}


	public T pop(){
		T e = top.data;
		top = top.next;
		return e;
	}
	
	public int multiPush(T els[] , int k)
	{
		int l=0;
		//int it=k;
		for(int i=0;i<k;i++) {
			//if( it>0) {
			Node<T> tmp = new Node<T>(els[i]);
			tmp.next=top;
			top = tmp;
		//	it--;
			l++;
			}
			//else	break;
		//}
		return l;
}
	public int multiPop(T els[] , int k)
	{
		int l=0;

		for(int i=0;i<k;i++) {
			if(  top != null) {
				els[i] = top.data;
				top = top.next;
			l++;
			}
			else	break;
		}
		return l;
}

	
}



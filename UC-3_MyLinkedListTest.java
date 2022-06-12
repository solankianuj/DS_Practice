package practiceDS;


public class MyLinkedListTest implements INode{
	 static MyNode head;
	 static MyNode tail;

	


	@Override
	public void printData() {
		MyNode temp=head;
		while(temp!=null) {
			System.out.print("Node "+temp.key+" | nextNodeRef : "+temp.next);
			temp=temp.next;
		}
		
	}
	

	@Override
	public void aappend(int key) {
		MyNode newNode= new MyNode(key); 
		if(head==null) {
			head=newNode;
		}
		else {
			MyNode temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
	}
	
	public static void main(String[] args) {
		MyLinkedListTest linkList=new MyLinkedListTest();
		
		linkList.aappend(56);
		linkList.aappend(30);
		linkList.aappend(70);
		System.out.println();

		linkList.printData();
	}
	}


	
	

	
	




package practiceDS;


public class MyLinkedListTest implements INode{
	 static MyNode head;
	 static MyNode tail;

	

	@Override
	public void add(int key) {
		MyNode newNode = new MyNode(key);
		if(tail==null) {
			tail=newNode;
		}
		else 
			 newNode.next=head;
			head=newNode;
	}

	@Override
	public void printData() {
		MyNode temp=head;
		while(temp!=null) {
			System.out.print("Node "+temp.key+" | nextNodeRef : "+temp.next);
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		MyLinkedListTest linkList=new MyLinkedListTest();

		linkList.add(70);
		linkList.add(30);
		linkList.add(56);
		System.out.println();

		linkList.printData();
	}


	}
	
	

	
	




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
	public void insert(int key) {
		MyNode newNode=new  MyNode(key);
			MyNode temp=head;
			temp.next=newNode;
			newNode.next=tail;
		
				}
	
	public static void main(String[] args) {
		MyLinkedListTest linkedList=new MyLinkedListTest();
		linkedList.head=new MyNode(56);
		linkedList.tail=new MyNode(70);
		linkedList.head.next=tail;
		
		linkedList.insert(30);
		
		linkedList.printData();
	}
		
	}


	
	
	

	
	




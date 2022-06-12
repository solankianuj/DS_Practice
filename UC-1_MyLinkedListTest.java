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
		
	public static void main(String[] args) {
		MyLinkedListTest linkList=new MyLinkedListTest();
		
		linkList.head=new MyNode(56);
		MyNode secondNode=new MyNode(30);
		MyNode thirdNode=new MyNode(70);
		
		linkList.head.next=secondNode;
		secondNode.next=thirdNode;
		
		System.out.println( );
		linkList.printData();
	}
	}


	
	
	

	
	




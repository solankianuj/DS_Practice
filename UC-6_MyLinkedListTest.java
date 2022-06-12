package practiceDS;


public class MyLinkedListTest implements INode{
	  MyNode head;
	  MyNode tail;


	@Override
	public void printData() {
		MyNode temp=head;
		while(temp!=null) {
			System.out.print("Node "+temp.key+" | nextNodeRef : "+temp.next);
			temp=temp.next;
		}
		
	}

	public void popLast() {
		MyNode temp=head;
			temp=temp.next;
			temp.next=tail;
	}
	
	public static void main(String[] args) {
		MyLinkedListTest linkList=new MyLinkedListTest();
		linkList.head=new MyNode(56);
		MyNode secondNode =new MyNode(30);
		linkList.head.next=secondNode;
		MyNode thirdNode = new MyNode(70);
		secondNode.next=thirdNode;
		
		linkList.popLast();
		linkList.printData();
	}
		
	}

	

	
		
	


	
	
	

	
	




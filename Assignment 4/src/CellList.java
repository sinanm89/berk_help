// -----------------------------------------------------
// Assignment 4
// Question: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
//import java.util.LinkedList;
import javax.xml.soap.Node;

public class CellList {
	
	
	private CellNode head;
	private int size;
	
	 public CellList() {
		 	size = 0;
		 	head = new CellNode();
	 }
//	 
//	 public CellList copy(CellList cell) {
//		 
////		CellList empty2 = new CellList();
////		
////		for(int i=0;i<cell.size;i++) {	
////			
////			this.addToStart(cell);
////		}
////		 return empty2;
//	 }

	 public CellPhone getHead() {
		return this.head.getCell();
	}

	public int getSize() {
		return this.size;
	}

	public void addToStart(CellPhone cell) {
		CellNode fafa = new CellNode(cell, this.head);
		head = fafa;
		fafa = null;
		size=size+1;
	}
	public void insertAtIndex() {
		
		size=size+1;
	}
	public void deleteFromIndex() {
		size=size-1;
	}
	public void deleteFromStart() {
		size=size-1;
	}
	public void replaceAtIndex() {
		size=size;
	}
	public void find() {
		//size=size;
	}
	public void contains() {
		//size=size;
	}
	public void showContents() {
		//size=size;
	}
	
	
	//INNER CLASS
	class CellNode{
		private CellPhone cell;
		private CellNode next;
		
		public CellNode() {
			cell=null;
			next=null;
		}
		public CellNode(CellPhone cell, CellNode next) {
			this.cell=cell;
			this.next=next;
		}
		public CellNode(CellNode node) {
			cell=node.cell;
			next=node.next;
		}
		public CellPhone getCell() {
			return cell;
		}
		public void setCell(CellPhone cell) {
			this.cell = cell;
		}
		public Node getNode() {
			return next;
		}
		public void setNode(CellNode next) {
			this.next = next;
		}
		public CellNode clone()
		{
			return new CellNode(this);
		}

		
	}
	
}

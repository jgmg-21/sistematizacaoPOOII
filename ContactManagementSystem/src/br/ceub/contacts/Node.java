package br.ceub.contacts;

public class Node {
	Contact contact;
	Node next;
	
	public Node(Contact contact) {
		this.contact = contact;
		this.next = null;
		
	}
}


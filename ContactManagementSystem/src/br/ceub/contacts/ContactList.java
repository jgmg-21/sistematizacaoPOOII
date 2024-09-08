package br.ceub.contacts;

public class ContactList {
	 private Node head;
	 
	 public void addContact(Contact contact) {
		 Node newNode = new Node(contact) ;
		 if (head == null) {
			 head = newNode;
		 } else {
			 Node temp = head;
			 while (temp.next != null) {
				 temp = temp.next;
			 }
			 temp.next = newNode;
		 }
		 System.out.println("Contato adicionado com sucesso.");
	 }
	 
	 public Contact searchContact(String nameOrPhone) {
		 Node temp = head;
		 while (temp != null) {
			 if (temp.contact.getName().equalsIgnoreCase(nameOrPhone) || temp.contact.getPhoneNumber().equals(nameOrPhone)) {
				 	return temp.contact;
			 }
			 temp = temp.next;
		 }
		 return null; 
	 }
	 
	 public boolean removeContact(String nameOrPhone) {
		 if (head == null) {
			 System.out.println("A lista está vazia");
			 return false;
		 }
		 
		 
		 Node current = head;
		 Node previous = null;
		 
		 if (current.contact.getName().equalsIgnoreCase(nameOrPhone) || current.contact.getPhoneNumber().equalsIgnoreCase(nameOrPhone)) {
			 head = current.next;
			 System.out.println("Contato removido: " + current.contact.getName());
			 return true;
		 }
		 
		 while (current != null) {
			 if (current.contact.getName().equalsIgnoreCase(nameOrPhone) || current.contact.getPhoneNumber().equals(nameOrPhone)) {
				 if (previous != null) {
					 previous.next = current.next;
				 }
				 System.out.println("Contato removido: " + current.contact.getName());
		         return true;	 
			 }
			 previous = current;
			 current = current.next;
		 }
		 
		 System.out.println("Contato não encontrado.");
		    return false;
		 
	 }
	 
	 public void listContacts() {
		 Node temp = head;
		 if (temp == null) {
			 System.out.println("A lista de contatos está vazia.");
		 } else {
			 while (temp != null) {
				 System.out.println(temp.contact);
				 temp = temp.next;
			 }
		 }
	 }

}

package br.ceub.contacts;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContactManager {
    public static void main(String[] args) {
    	 ContactList contactList = new ContactList();
    	 Scanner scanner = new Scanner(System.in);
    	 int choice = 0;
    	 
    	 do {
    		 System.out.println("\nMenu:");
    		 System.out.println("1. Adicionar contato");
    		 System.out.println("2. Buscar contato");
    		 System.out.println("3. Remover contato");
    		 System.out.println("4. Listar todos os contatos");
    		 System.out.println("5. Sair");
    		 System.out.println("Escolha uma opção:");
    		 
    		 try {
    			 choice = scanner.nextInt();
    			 scanner.nextLine();
    		 } catch (InputMismatchException e) {
    			 System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
    			 scanner.nextLine();			 
    			 continue;
    		 }  	
    		 
    		 switch (choice) {
    		 case 1:
    			 System.out.println("Nome: ");
    			 String name = scanner.nextLine();
    			 System.out.println("Telefone: ");
    			 String phoneNumber = scanner.nextLine();
    			 System.out.println("Email: ");
    			 String email = scanner.nextLine();
    			 Contact newContact = new Contact(name, phoneNumber, email);
    			 contactList.addContact(newContact);
    			 break;
    		 case 2:
    			 System.out.println("Digite o nome ou telefone do contato: ");
    			 String searchQuery = scanner.nextLine();
    			 Contact foundContact = contactList.searchContact(searchQuery);
    			 if (foundContact != null) {
    				 System.out.println("Contato encontrado: " + foundContact);
    			 } else {
    				 System.out.println("Contato não encontrado.");
    			 }
    			 break;
    		 case 3:
    			 System.out.println("Digite o nome ou telefone do contato para remover: ");
    			 String removeQuery = scanner.nextLine();
    			 if (contactList.removeContact(removeQuery)) {
    				 System.out.println("");
    			 } else {
    				 System.out.println("Contato não encontrado.");
    			 }
    			 break;
    		 case 4:
    			 contactList.listContacts();
    			 break;
    		 case 5:
    			 System.out.println("Encerrando o sistema...");
    			 break;
    	     default:
    	    	 System.out.println("Opção inválida");			 
    		 }
    	 } while (choice != 5);
    	 
    	 scanner.close();
    }
}


Contact Manager

DESCRIÇÃO
O Contact Manager é uma aplicação simples em Java que utiliza listas encadeadas para gerenciar um catálogo de contatos. O sistema permite ao usuário adicionar, buscar, remover e listar contatos por meio de uma interface de linha de comando (CLI). Cada contato armazena informações de nome, número de telefone e e-mail.

Este projeto foi desenvolvido como parte de uma atividade prática para explorar a implementação de estruturas de dados dinâmicas (listas encadeadas) e algoritmos de busca.

FUNCIONALIDADES
Adicionar Contato: Permite adicionar um novo contato à lista, fornecendo nome, telefone e e-mail.
Buscar Contato: Permite buscar contatos pelo nome ou número de telefone.
Remover Contato: Remove um contato com base no nome ou número de telefone fornecido.
Listar Contatos: Exibe todos os contatos armazenados no sistema.
Sair: Encerra o programa.

ESTRUTURA DO PROJETO
O projeto está organizado em quatro classes principais:

Contact: Representa um contato com os atributos nome, telefone e e-mail.
Node: Representa um nó na lista encadeada, armazenando um contato e uma referência para o próximo nó.
ContactList: Implementa a lista encadeada com métodos para adicionar, buscar, remover e listar contatos.
ContactManager: Controla a interação com o usuário por meio de um menu em linha de comando.

USO
Ao iniciar o programa, um menu será exibido com as opções disponíveis:

Menu:
1. Adicionar contato
2. Buscar contato
3. Remover contato
4. Listar todos os contatos
5. Sair
Insira o número da opção desejada e siga as instruções na tela para interagir com o sistema. Por exemplo, ao escolher a opção 1, você será solicitado a inserir o nome, telefone e e-mail de um novo contato.

O programa continua exibindo o menu até que a opção "Sair" seja escolhida.

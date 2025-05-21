# Sistema de Gerenciamento de Biblioteca


## Descrição do Projeto


Este sistema permitirá ao usuário gerenciar uma lista de livros em uma biblioteca usando `arrays`, `arrayList` ou `hashmap`. O sistema deve permitir adicionar livros, pesquisar por título, excluir livros e listar todos os livros cadastrados.


## Menu do Sistema



### O sistema deve apresentar um menu com 4 opções:

* Adicionar Novo Livro
* Pesquisar Livro por Título
* Excluir Livro pelo Título
* Listar Todos os Livros
* Sair do Sistema
    



## Detalhes das Operações


### Adicionar Novo Livro:

>1. Solicite ao usuário o título e o autor do livro.
>2. Armazene as informações em alguma estrutura de dados.
>3. Exiba uma mensagem confirmando a adição do livro.



### Pesquisar Livro por Título:

>1. Permita que o usuário busque um livro pelo título.
>2. Se o livro for encontrado, exiba suas informações. Caso contrário, informe `"Livro não encontrado."`



###  Excluir Livro pelo Título:

>1. ○ Permita que o usuário exclua um livro pelo título.
>2. Se o livro for encontrado e excluído, exiba `"Livro excluído com sucesso!"`.
>3. Se não for encontrado, informe `"Livro não encontrado."`


### Listar Todos os Livros:

>1. Mostre todos os livros cadastrados no sistema.
>2. Se não houver livros cadastrados, exiba `"Nenhum livro cadastrado."`


## Feedback nas Operações:

Em todas as operações, fornecer feedback ao usuário. Por exemplo, ao concluir o cadastro de um novo livro, exibir a mensagem `"Novo livro cadastrado com sucesso!"`.

Ao excluir um livro, confirmar a exclusão com a mensagem "Livro excluído com sucesso!".

Se uma operação não puder ser concluída (por exemplo, ao tentar excluir um livro - inexistente), informar ao usuário com a mensagem `"Operação falhou: livro não encontrado."`.

## Validação de Dados:

Verificar se todos os campos obrigatórios foram preenchidos antes de realizar o cadastro ou agendamento.

Informar o usuário em caso de campos obrigatórios ausentes, por exemplo, `"Por favor, preencha todos os campos obrigatórios."`

# Projeto Loja Online
O objetivo é bota em pratica as habilidades que venho praticando
Tanto java e Banco de Dados, por enquanto mexer com MySQL. Mas futuramente mexer com PostegreSQL.

----
A loja virtual falando em infrastrtura de do back-end terá:
1. Cadastro de cliente e login com senha criptografada que serão armazenadas no banco de dados;
2. Cadastro de produtos e dos seus respectivos fornecedores passando para o banco de dados;
3. O cliente cadastrado terá acesso aos produtos disponíveis, descontos do dia, quantidades, informações sobre, fornecedor;
4. Fazer a verificação se o produto está no estoque do fornecedor específico, e mostrar com um símbolo que está em falta ou só aparece a imagem do produto, mas sem o botão disponível;
5. Se tiver e ao fazer o carrinho (que seja possível para colocar a quantidade e caso o cliente delete um dos itens, fazer uma estrtura de dados lista, em vez de dois, por exemplo vai ser um produo no carrinho ).
6. confirmação de endereço ( que realmente funcione com endereço da vida real) e em seguida formas de pagamento, pix, cartão de credito ou usar dois tipos de cartão para pagar as parcelas (Seja usando com api ou criando um proprio um tempo depois).

> Ideias de acréscimo: 

> Fazer o próprio sistema de pagamento ( a pricípio usarei as apis),

> Mudar o mySQL apra PostegreSQL;

> Melhorar segurança de acesso ou de cadastro, utilizando sistema de autenticação;

> Rastreio da encomenda;
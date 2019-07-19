#Objeto que temos uma coleção de dados e essa coleção é feita através de chave e valor
#Diferença: array a coleção é feita pelo índice do tipo inteiro e no hash da p ser feito por chave/valor

carro = Hash[nome: 'Fiesta', marca: 'Ford', cor: 'Branco']

#exibe todo o hash
puts carro

#exibe uma chave especifica
puts carro[:nome]

#insere nova chave
carro[:modelo] = 'SE'
puts carro


def diga_ola(nome)
    puts 'Olá!, ' + nome
end

#chamada do método
diga_ola('Rone')

# Em ruby, o retorno é sempre a ultima instrução do método
def retorna_nome
    'Rone e Flavia'
end

resultado = retorna_nome
puts resultado

# Argumentos
def soma(v1,v2)
    total = v1 + v2
    total
end

res = soma(10,10)
puts res
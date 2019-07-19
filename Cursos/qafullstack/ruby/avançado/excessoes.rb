
# begin

#     # Devo tentar alguma coisa
#     file = File.open('./ola.txt')
#     if file
#         puts file.read
#     end
# rescue Exception => e
#     #Obter um possivel erro
#     puts e.message
#     puts e.backtrace #traça o caminho do erro na tela
# end

def soma(n1 ,n2)
    n1 + n2
rescue
    puts 'Erro ao executar a soma'
end

soma('10', 5)
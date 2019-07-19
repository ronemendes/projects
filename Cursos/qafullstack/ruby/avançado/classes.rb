#ruby é considerada uma linguagem puramente orientada a objeto

# class Carro
#     attr_accessor :nome    #atributo

#     #método
#     def ligar
#         puts 'O carro estragou'
#     end
    
# end

# civic = Carro.new  #criando a instancia
# civic.nome = 'Civic' #atribuindo valor ao atributo

# puts civic.nome
# civic.ligar

class Conta
    attr_accessor :saldo, :nome

    #construtor: método que é executado toda vez que eu crio um objeto
    def initialize(nome)
        self.saldo = 0.0
        self.nome = nome
    end

    def deposita(valor)
        self.saldo +=  valor  #equivale ao this. pega o atributo da propria classe
        puts "Depositando a quantia de #{valor} reais para o #{self.nome}"  #interpolação de string.
    end
end

c = Conta.new('Rone') #passando o parametro do construtor

c.saldo = 0.0
c.deposita(100.00)
puts c.saldo

c.deposita(10.00)
puts c.saldo
puts c.nome

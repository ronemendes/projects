#Dado que eu tenho R$1000 em minha conta corrente
#Quando eu faço um saque de R$400
#Então meu saldo final deve ser R$600
#E vejo a mensagem 'Rone, você ta pobre'

class Exercicio_ContaCorrente
    attr_accessor :saldo, :mensagem

    def initialize (saldo)
        self.saldo = saldo
    end

    def saque(valor)
        self.saldo -= valor
        self.mensagem = 'Rone, você ta pobre'
    end
    
end

describe Exercicio_ContaCorrente do 

    describe 'Saque' do
        context 'deve realizar saque' do 
            before(:all) do
                @cc = Exercicio_ContaCorrente.new(1000) #Dado
                @cc.saque(400)  #Quando
            end
            it 'o saldo atualiza' do
                expect(@cc.saldo).to eql 600 #Então
            end

            it 'exibe a mensagem' do
                expect(@cc.mensagem).to eql 'Rone, você ta pobre'
            end
        end
    end
    
end
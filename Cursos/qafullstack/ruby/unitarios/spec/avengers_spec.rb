

class AvengersHearQuarter
    attr_accessor :list #lista

    #construtor - Toda vez que instanciar, vai transformar a lista num array
    def initialize
        self.list = []
    end

    #método que adiciona um vingador
    def put(avenger)
        self.list.push(avenger) #add um vingador na lista
    end
end

#TDD
#switch
describe AvengersHearQuarter do  #nome de uma classe

    #cenario
    it 'deve adicionar um vingador' do
        #testes
        hq = AvengersHearQuarter.new   #instancia

        hq.put('Spiderman')            #metodo para add um vingador
        expect(hq.list).to eql ['Spiderman']  #verificação. A lista é igual ao Array?
    end

    it 'deve adicionar uma lista de vingadores' do
        hq = AvengersHearQuarter.new
        hq.put('Thor')
        hq.put('Hulk')
        hq.put('Spiderman')
        expect(hq.list).to include 'Thor' #Thor ta incluido na lista
    end

    it 'deve adicionar uma lista de vingadores' do
        hq = AvengersHearQuarter.new
        hq.put('Thor')
        hq.put('Hulk')
        hq.put('Spiderman')
        
        res = hq.list.size > 0 #valida true ou false e guarda na variavel

        expect(hq.list.size). to be > 0 #traz o total e verifica se é maior q 0
        expect(res).to be true #res é true?
    end

    it 'Thor deve ser o primeiro da lista' do
        hq = AvengersHearQuarter.new
        hq.put('Thor')
        hq.put('Hulk')
        hq.put('Spiderman')
        
        expect(hq.list).to start_with('Thor') #inicia com Thor?
    end

    it 'Ironman deve ser o ultimo da lista' do
        hq = AvengersHearQuarter.new
        hq.put('Thor')
        hq.put('Hulk')
        hq.put('Spiderman')
        hq.put('Ironman')
        
        expect(hq.list).to end_with('Ironman') #termina com Ironman?
    end

    it 'deve contor o sobrenome' do
        avenger = 'Peter Parker'

        expect(avenger).to match(/Parker/) #compara com expressão regular. Parker contem em avenger?
        expect(avenger).not_to match(/Rone/) #compara com expressão regular. Rone contem em avenger?
    end


end
module Enjoeat
    def prato_do_dia(dia)
        if dia == 'segunda-feira'
            'Virado a Paulista'
        elsif dia == 'terça-feira'
            'Dobradinha'
        elsif dia == 'quarta-feira'
            'Feijoada'
        elsif dia == 'quinta-feira'
            'Macarronada'
        elsif dia == 'sexta-feira'
            'Filé de Merluza'
        elsif dia == 'sábado'
            'Veja o cardápio'
        elsif dia == 'domingo'
            'Fechado'
        else 
            'Dia inválido'
        end
    end
end
World Enjoeat  #Expõe todos os métodos desse módulo


Dado("que hoje é {string}") do |dia|
    @hoje = dia       #recebe o dia
end
  
Quando("eu pergunto qual é o prato do dia") do
    @resposta_obtida = prato_do_dia(@hoje)   #prato do dia recebe o dia (@hoje) e armazena na variável
end
  
Então("a resposta deve ser {string}") do |resposta_esperada|  #resposta_esperada = esta na massa de teste
    expect(@resposta_obtida).to eql resposta_esperada   #verifica se a resposta obtida é igual a esperada
end
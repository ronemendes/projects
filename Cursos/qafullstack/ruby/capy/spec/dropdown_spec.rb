describe 'Caixa de opções', :dropdown do 

    it 'item específico simples' do
        visit '/dropdown'
        select('Loki', from: 'dropdown')
        sleep 3 #temporário
    end

    #quando não tem id
    it 'item especifico com o find' do
        visit '/dropdown'
        drop = find('.avenger-list') #avenger-list é a classe. pegando o elemento e jogando na variável. drop guarda a busca
        drop.find('option', text: 'Scott Lang').select_option #busca dentro do elemento 'select' único e exclusivamente
        sleep 3
    end

    it 'qualquer item', :sample do 
        visit '/dropdown'
        drop = find('.avenger-list')
        drop.all('option').sample.select_option #all - pega os valores num array
    end                                         #sample - pega qq um. Random

end
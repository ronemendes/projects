describe 'suite rspec' do  #cenário de teste

    #cenario
    it 'soma de valores' do
        soma = 10 + 5
        expect(soma).to eql 15   #verifica o esperado. Recurso do rspec
    end
end
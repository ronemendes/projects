describe 'Login 2', :login2 do

    before(:each) do
        visit '/login2'
    end

    it 'com data de nascimento' do
        
        find('#userId').set 'stark'
        find('#passId').set 'jarvis!'

        login_form = find('#login')  #busca o formulario que tem o id 'login' e guarda na variavel

        #Case para verificar cada situação através do texto do login forme
        case login_form.text
        when /Dia/         #se tiver a palavra "Dia" no texto do formulário, faz isso
            find('#day').set '29'
        when /Mês/          #se tiver a palavra "Mês" no texto do formulário, faz isso
            find('#month').set '05'
        when /Ano/          #se tiver a palavra "Ano" no texto do formulário, faz isso
            find('#year').set '1970'
        end

            click_button 'Login'
            expect(find('#flash')).to have_content 'Olá, Tony Stark. Você acessou a área logada!'

    end


end
describe 'Forms', :smoke do

    it 'login com sucesso' do
        visit '/login'

        fill_in 'username', with: 'stark'  #preenche os campos
        fill_in 'password', with: 'jarvis!'

        click_button 'Login'                #clica no botão

        expect(find('#flash').visible?).to be true   #verifica se a mensagem é visível

        expect(find('#flash').text).to include 'Olá, Tony Stark. Você acessou a área logada!' #valida mensagem exibida na tela
        expect(find('#flash')).to have_content 'Olá, Tony Stark. Você acessou a área logada!' #outra forma

        #to_eql = compara as strings
        #include ou have_content = verifica se contém na string

        
    end

    it 'senha incorreta' do
        visit '/login'

        fill_in 'username', with: 'stark'
        fill_in 'password', with: '111'

        click_button 'Login'

        expect(find('#flash')).to have_content 'Senha é invalida!'

    end

    it 'usuário não cadastrado' do
        visit '/login'

        fill_in 'username', with: 'Rone'
        fill_in 'password', with: 'jarvis!'

        click_button 'Login'

        expect(find('#flash')).to have_content 'O usuário informado não está cadastrado!'

    end

end
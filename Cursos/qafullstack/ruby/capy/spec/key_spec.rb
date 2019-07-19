describe 'Teclado', :key do

    before(:each)do
        visit '/key_presses'
    end

    it 'enviando teclas' do
        teclas = %i[tab escape space enter shift control alt]  #%i - array de símbolos

        teclas.each do |t|  #percorrendo foreach
            find('#campo-id').send_keys t
            expect(page).to have_content 'You entered: ' + t.to_s.upcase #verifica frase na tela. Converte para string e depois para upercase
            sleep 1
        end

    end

    it 'enviando letras' do
        letras = %w[a s d f g h j k l]   #%w - array de strings

        letras.each do |l|   #percorrendo foreach
            find('#campo-id').send_keys l
            expect(page).to have_content 'You entered: ' + l.to_s.upcase #verifica frase na tela. Converte para string e depois para upercase
            sleep 1
        end
    end
end
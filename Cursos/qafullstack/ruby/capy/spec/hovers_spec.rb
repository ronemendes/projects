describe 'Mouse Hover', :hovers do

    before(:each) do
        visit '/hovers'
    end

    it 'quando passo o mouse sobre o blade' do
        card = find('img[alt*=Blade]')  #seletor css
        card.hover  #ação do mouse

        expect(page).to have_content 'Nome: Blade'
    end

    it 'quando passo o mouse sobre o pantera negra' do
        card = find('img[alt^=Pantera]')  #seletor css
        card.hover  #ação do mouse

        expect(page).to have_content 'Pantera Negra'
    end

    it 'quando passo o mouse sobre o homem aranha' do
        card = find('img[alt$=Aranha]')  #seletor css
        card.hover  #ação do mouse

        expect(page).to have_content 'Homem Aranha'
    end

    after(:each) do
        sleep 0.5 #temporario, só para verificar o resultado
    end
end
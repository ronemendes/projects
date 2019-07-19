describe 'Alternando janelas', :wnd do

    before(:each) do
        visit '/windows'
    end

    it 'nova janela' do

        nova_janela = window_opened_by { click_link 'Clique aqui' }

        within_window -> { page.title == 'Nova Janela' } do   #pega o conteudo da aba e guarda na variavel
            expect(page).to have_content 'Aqui temos uma nova janela \o/'  #verifica a mensagem na tela
        end

        nova_janela.close   #fecha a aba aberta
        expect(nova_janela.closed?).to be true   #verifica se realmente a janela foi fechada


        sleep 3
    end
end
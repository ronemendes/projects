describe 'iframes' do

    describe 'bom', :nice_frame do
        before(:each) do
            visit '/nice_iframe'
        end

        it 'adicionar ao carrinho' do
            within_frame('burgerId') do  #Pega o id do frame
                produto = find('.menu-item-info-box', text: 'REFRIGERANTE') #pega a classe onde está a palavra refrigerante
                produto.find('a').click  #clica no link
                expect(find('#cart')).to have_content 'R$ 4,50'    #pega o id correspondente ao 'Carrinho'
                sleep 5
            end
        end
    end

    describe 'ruim', :bad_frame do
        before(:each) do
            visit '/bad_iframe'
        end

        it 'carrinho deve estar vazio' do
            
            script = '$(".box-iframe").attr("id", "tempId");'  #como não tem id, utiliza-se esse código jquery para add um id provisório (gambis)
            page.execute_script(script)   #executa o script

            within_frame('tempId') do   #pega o id temporario
                expect(find('#cart')).to have_content 'Seu carrinho está vazio!'  #pega o id do carrinho e verifica a frase
                sleep 3
            end
        end
    end
end
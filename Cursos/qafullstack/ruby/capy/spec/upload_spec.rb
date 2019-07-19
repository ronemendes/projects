describe 'Upload', :upload do

    before (:each) do
        visit '/upload'
        @arquivo = Dir.pwd + '/spec/fixtures/arquivo.txt' #Concatenando com o arquivo relativo. Armazenar o caminho do arquivo
        @imagem = Dir.pwd + '/spec/fixtures/Galo.png'
    end

    it 'upload com arquivo texto' do
        attach_file('file-upload', @arquivo) #upload do arquivo
        click_button 'Upload'   #clica no botão

        div_arquivo = find('#uploaded-file')
        expect(div_arquivo.text).to eql 'arquivo.txt' #verificar se realmente fez o upload
    end

    it 'upload de imagem' do
        attach_file('file-upload', @imagem) #upload do arquivo
        click_button 'Upload'   #clica no botão

        img = find('#new-image')
        expect(img[:src]).to include '/uploads/Galo.png'
       
    end

    after (:each) do
        sleep 3
    end
end
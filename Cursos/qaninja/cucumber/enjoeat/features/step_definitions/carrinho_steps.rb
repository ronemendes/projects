Dado("que o produto desejado é {string}") do |produto|
    @produto_nome = produto
end
  
Dado("o valor do produto é de {string}") do |valor|
    @produto_valor = valor
end
 
Quando("eu adiciono {int} unidade\\(s)") do |quantidade|
    quantidade.times do   #loop. Vai rodar a quantidade de acordo com o que foi passado no parametro
        find(".menu-item-info-box", text: @produto_nome.upcase).find(".add-to-cart").click   #técnica para fazer a busca pelo nome. Pega a div q tem o valor "Cup Cake".
    end                                                                                                             #Escopo. Pega o elemento o pai e depois o filho
    
end                                                                                         
  
Então("deve ser adicionado {int} unidade\\(s) deste item") do |quantidade|
    cart = find("#cart")  #com hashtag, é pra pegar o id
    expect(cart).to have_text "(#{quantidade}x) #{@produto_nome}"  #interpolação de string
end
  
Entao("o valor total deve ser {string}") do |valor_total|
    cart = find("#cart")
    total = cart.find("tr", text: "Total:").find("td")  #equivale à um xpath
    expect(total.text).to eql valor_total   #no carrinho tem o texto que representa o valor total?
end


#Lista de Carrinhos


Dado("que os produtos desejados são:") do |table|                            
    @product_list = table.hashes  #Transforma num array de hashes.
end                                                                          
                                                                               
Quando("eu adiciono todos os itens") do                                      
    #foreach para ir adicionando 1 a 1
    @product_list.each do |p|
        p['quantidade'].to_i.times do
            find(".menu-item-info-box", text: p["nome"].upcase).find(".add-to-cart").click
        end
    end
end                                                                          
                                                                               
Então("eu vejo todos os itens no carrinho") do                               
    cart = find("#cart")    #verificar elemento carrinho. Faço um find na div do carrinho
    quantidade = 1
    @product_list.each do |p|
        expect(cart).to have_text "(#{p["quantidade"]}x) #{p["nome"]}"
    end
end                                                                          


#Remover itens

Dado("que eu tenho os seguintes itens no carrinho:") do |table|   #Pré-requisito: add itens no carrinho
    @product_list = table.hashes
    @product_list.each do |p|
        p['quantidade'].to_i.times do
            find(".menu-item-info-box", text: p["nome"].upcase).find(".add-to-cart").click
        end
    end
end
  
Quando("eu removo somente o item {int}") do |item|
    cart = find("#cart")
    cart.all("table tbody tr")[item].find(".danger").click   #'table tbody tr' caminho para encontrar o botão para o click
end                                                           # '.danger': classe do botão de exclusão
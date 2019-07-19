                                                                        
                                                                               
Dado("que temos os seguintes restaurantes") do |table|
   @restaurant_data = table.hashes   #transforma a tabela num array
end

Quando("acesso a lista de restaurantes") do                                  
    visit '/restaurants'
end  
  
Então("devo ver todos os restaurantes dessa lista") do
    restaurants = all('.restaurant-item')

    @restaurant_data.each_with_index do |value, index|
        expect(restaurants[index]). to have_text value['nome'].upcase
        expect(restaurants[index]). to have_text value['categoria']
        expect(restaurants[index]). to have_text value['entrega']
        expect(restaurants[index]). to have_text value['avaliacao']
    end
end












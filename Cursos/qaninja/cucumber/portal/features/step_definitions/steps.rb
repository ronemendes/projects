Quando("eu faço uma busca pelo termo {string}") do |termo|     #termo - variavel do texto que vou passar no navegador            
    visit 'https://portal.qaninja.io/cursos'
    find('#searchtext').set termo       # com '#palavra' significa que é o id
    find('#btn_form_search').click    
end                                                                           
                                                                                
Então("devo ver a seguinte notificação {string}") do |notificacao|                 
    expect(page).to have_text notificacao   #verifica se o texto existe
end                                                                           
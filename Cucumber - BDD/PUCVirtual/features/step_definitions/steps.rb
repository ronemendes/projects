Dado("que estou na tela de login") do                                        
  visit 'https://ava.virtual.pucminas.br/login/index.php'
end                                                                          

Quando("eu clicar em Acessar") do
  find(".clearer", id: anchor).find(".input").click
end

Então("o sistema deverá me exibir uma mensagem") do
  pending # Write code here that turns the phrase above into concrete actions
end


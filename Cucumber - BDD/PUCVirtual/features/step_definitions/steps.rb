Dado("que estou na tela de login") do                                        
  visit 'https://ava.virtual.pucminas.br/login/index.php'
end                                                                          

Quando("eu clicar em Acessar") do
  find("#loginbtn").click
end

Então("o sistema deverá me exibir a {string}") do |msg|
  expect(page).to have_text msg
end


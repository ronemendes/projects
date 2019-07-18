Dado("que estou na tela de login") do                                        
  visit 'https://ava.virtual.pucminas.br/login/index.php'
end                                                                          

Quando("eu clicar em Acessar") do
  find("#loginbtn").click
end

Então("o sistema deverá me exibir a mensagem {string}") do |msg|
  expect(page).to have_text msg
end



Quando("eu informo {string} e {string}") do |login, senha|
  find('#username').set login
  find('#password').set senha
end

Quando("clico em Acessar") do
  find("#loginbtn").click
end

Então("devo logar e ver a seguinte mensagem: {string}") do |msg2|
  expect(page).to have_text msg2
end
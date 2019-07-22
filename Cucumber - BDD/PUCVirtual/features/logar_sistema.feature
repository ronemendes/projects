#language: pt

Funcionalidade: Autenticação Usuário
	Logar em sistema de aprendizagem PUC Minas
	
Cenário: Usuário deseja acessar ambiente de aprendizagem da PUC Minas com dados errados
	Dado que estou na tela de login
	Quando eu clicar em Acessar
	Então o sistema deverá me exibir a mensagem "Nome de usuário ou senha errados. Por favor tente outra vez."
		
Cenário: Usuário loga no sistema
	Dado que estou na tela de login
	Quando eu informo "L566997" e "1623807"
	E clico em Acessar
	Então devo logar e ver a seguinte mensagem: "Rone"

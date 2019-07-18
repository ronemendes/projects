#language: pt

Funcionalidade: Autenticação Usuário
	Logar em sistema de aprendizagem PUC Minas
	
Cenário: Usuário deseja acessar ambiente de aprendizagem da PUC Minas
	Dado que estou na tela de login
	Quando eu clicar em Acessar
	Então o sistema deverá me exibir a "Nome de usuário ou senha errados. Por favor tente outra vez."
	
	
# Cenário: Página de login deve exibir mensagem de erro em caso de autenticação inválida
# 	Dado que estou na tela de login
# 	Quando eu informar "usuario" e "senha" inválidos
# 	Então o sistema deve exibir uma "mensagem" de erro
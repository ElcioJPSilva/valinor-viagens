Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Denis Cople
// Descrição   : Site Valinor Viagens
// Autor(a)    : Élcio José Pereira da Silva
// Data atual  : 11/07/2022
Var
   // Seção de Declarações das variáveis
   nome_dois: vetor [1..2]  de caractere
   idade_dois: vetor [1..2] de inteiro
   destino_dois: vetor [1..7] de caractere
   origem_dois: vetor [1..7] de caractere
   nome: caractere
   sobrenome: caractere
   consultar_destino: inteiro
   d,idade, destino: inteiro
   consulta: inteiro
   dados: inteiro

Inicio
procedimento consultar
inicio
   escreval("Seus dados cadastrados: ")
   escolha consulta
   caso 1
      escreval("Cadastre-se")
      menu()
   caso 2
      escreval("Qual seu nome? ", nome_dois[1])
      escreval("Qual seu sobrenome? ", nome_dois[2])
      escreval("Qual sua idade? ", idade_dois[1])
      escolha consultar_destino
      caso 1
         escreval("Qual seu destino? ", destino_dois[1])
      caso 2
         escreval("Qual seu destino? ", destino_dois[2])
         menu()
      caso 3
         escreval("Qual seu destino? ", destino_dois[3])
      fimescolha
   fimescolha
fimprocedimento


procedimento cadastro
inicio
   escreval("Digite seu nome", nome)
   leia(nome)
   nome_dois[1]<-nome
   escreval("Digite seu sobrenome", sobrenome)
   leia (sobrenome)
   nome_dois[2]<-sobrenome
   escreval("Digite sua idade", idade)
   leia(idade)
   idade_dois[1]<-idade
   escreval("Digite seu Destino")
   escreval("1 - Valfenda")
   escreval("2 - Erebor")
   escreval("3 - Cidade do Lago")
   escreval("4 - Condado")
   escreval("5 - Édoras")
   escreval("6 - Argonath")
   escreval("7 - Lothlorien")
   leia(destino)
   escolha destino
   caso 1
      destino_dois[1]<-"Valfenda"
      consultar_destino<-1
      consulta<-2
      menu()
   caso 2
      destino_dois[2]<-"Erebor"
      consulta<-2
      consultar_destino<-2
      menu()
   caso 3
      destino_dois[3]<-"Cidade do Lago"
      consulta<-2
      consultar_destino<-3
      menu()
   caso 4
      destino_dois[4]<-"Condado"
      consulta<-2
      consultar_destino<-4
      menu()
   caso 5
      destino_dois[5]<-"Édoras"
      consulta<-2
      consultar_destino<-5
      menu()
   caso 6
      destino_dois[6]<-"Argonath"
      consulta<-2
      consultar_destino<-6
      menu()
   caso 7
      destino_dois[7]<-"Lothlorien"
      consulta<-2
      consultar_destino<-7
      menu()
   outrocaso
      escreval("Digite uma opção válida")
   fimescolha
fimprocedimento

procedimento menu
inicio
   escreval("escolha uma opção")
   escreval("1 Cadastro")
   escreval("2 Consulta")
   leia(dados)
   escolha dados
   caso 1
      cadastro()
   caso 2
      consultar()
   fimescolha
fimprocedimento
// Seção de Comandos, procedimento, funções, operadores, etc...
menu()


Fimalgoritmo
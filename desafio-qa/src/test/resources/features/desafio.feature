#language: pt
#Autor: fellipe.vidal@outlook.com


Funcionalidade: Realizar compras
  Eu como usuario quero acessar ao site  e realizar compras 
  
  Fundo:
  Dado que eu selecione o produto no site
 
 
  Cenario: Realizar compra alterando o endereco de entrega
   
    Quando alterar o endereco de entrega
    E confirmar o envio
		E confirmar pagamento
		Entao a compra sera efetuada com sucesso


  Cenario: Realizar compra alterando o endereco de cobranca
  
  Quando alterar o endereco de cobranca
  E confirmar o envio
  E confirmar pagamento
  Entao a compra sera efetuada com sucesso

  
  
  Cenario: Realizar compra e efetuar pagamento com cheque
  
  E confirmar endereco
  E confirmar o envio
  Quando selecionar pagamento com cheque
  Entao a compra sera efetuada com sucesso
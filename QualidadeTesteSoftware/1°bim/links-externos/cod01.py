import requests

"""
cep = input('Digite o número do seu CEP:')

link = f"http://viacep.com.br/ws/{cep}/json/"

requisicao = requests.get(link)
dicRequisicao = requisicao.json()
print(dicRequisicao)

estadobuscador = dicRequisicao['uf']
logradourobuscador = dicRequisicao['logradouro']
bairrobuscador = dicRequisicao['bairro']
cidadebuscador = dicRequisicao['localidade']

print(estadobuscador)
print(logradourobuscador)
print(bairrobuscador)
print(cidadebuscador)
"""



"""
moeda = input('Digite:   USD || ARS || ETH:')

link = f"https://economia.awesomeapi.com.br/all/{moeda}"

requisica = requests.get(link)
dicRequisica = requisica.json()
print (dicRequisica)

"""



dias = input('Digite o período em dias a consultar: ')

for i in range(1, dias):
    i += 1
    requisic = requests.get(link)
    dicRequisic = requisic.json()
    link = f"https://economia.awesomeapi.com.br/all/{dias}"
    print('¨¨'*40)
  

import requests

""" Moeda (Feito)
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


""" Clima () """
print("Clima Hoje: ")
link = f"https://api.tempo.com/index.php?api_lang=br&localidad=12996&affiliate_id=tk99un15usak&v=3.0"
requisic = requests.get(link)
dicRequisic = requisic.json()
print(f"Data: {dicRequisic['location']}")
print(f"Dia Semana: {dicRequisic}")
print(f"Descrição Tempo: {dicRequisic}")
print(f"Temperatura Mínima: {dicRequisic['location']}")
print(f"Temperatura Máxima: {dicRequisic['location']}")
print(f"Velocidade Vento: {dicRequisic['location']}")
print(f"Humidade Relativa Do Ar: {dicRequisic['location']}")
print(f"Hora Nascer Do Sol: {dicRequisic['location']}")
print(f"Hora do pôr do Sol: {dicRequisic['location']}")
print(f"Fase da Lua: {dicRequisic['location']}")
print(f"Localização: {dicRequisic['location']}")



""" AdviceSlipe (Feito) 
print("Slipe Advice: ")
link = "https://api.adviceslip.com/advice"
requisicao = requests.get(link)
print(requisicao.json()['slip']['id'])
print(requisicao.json()['slip']['advice'])
"""

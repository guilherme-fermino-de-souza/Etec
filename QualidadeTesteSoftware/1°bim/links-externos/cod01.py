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


""" Clima (Feito) """
print("Clima Hoje: ")
link = f"http://api.tempo.com/index.php?api_lang=br&localidad=12996&affiliate_id=tk99un15usak&v=3.0"
dicRequisic = requests.get(link).json()

dias_disponiveis = list(dicRequisic['day'].keys())
dia_escolhido = int(input(f"Escolha um dia entre: {dias_disponiveis}"))
dia = dicRequisic['day'][dia_escolhido]

tempo = dia['symbol_description']
dia_semana = dia['name']

print("Tempo: ", tempo)
print("Dia: ", dia_semana)

""" AdviceSlipe (Feito) 
print("Slipe Advice: ")
link = "https://api.adviceslip.com/advice"
requisicao = requests.get(link)
print(requisicao.json()['slip']['id'])
print(requisicao.json()['slip']['advice'])
"""

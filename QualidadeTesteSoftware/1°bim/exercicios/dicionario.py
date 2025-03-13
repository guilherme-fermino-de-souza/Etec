#meuDicionario = {'chave01':valorChave1, 'chave02':valorChave2, 'chave03': valorChave3, 'chave04': valorChave4}

meuDicionario = {"chave01": 30, 'chave02': 'textinho', 'chave03': 5.1, 'chave04': True}
valorChave2 = meuDicionario.get('chave02')

print(valorChave2)


meuDicionario['chave01'] = 212
print(meuDicionario)


dicionarioCores = {} #espaço vazio

dicionarioCores['White'] = 'Branco'
dicionarioCores['Black'] = 'Preto'
dicionarioCores['Red'] = 'Vermelho'
dicionarioCores['Yellow'] = 'Amarelo'
dicionarioCores['Blue'] = 'Azul'

print(dicionarioCores)


"""novoDicionario = {}

for i in range(0, 9):
    novoDicionario[i] = i*i

print(novoDicionario)
"""


"""
dicionarioTerceiro = {}
i = 1
while i < 4:
    dicionarioTerceiro[i] = input("Digite um valor para o dicionário")
    i+=1

print(dicionarioTerceiro)
"""


del dicionarioCores ['Red']
print(dicionarioCores)


dicionarioLinguado = {1:'Python', 2:'Java', 3:'JavaScript', 4:'PHP', 5:'C#'}

for chave in dicionarioLinguado:
    print(chave)
print(30*'¨')



for chave, valor in dicionarioLinguado.items():
    print(chave, valor)
print(30*'¨')



dicioMisto = {1: 2022, 2: 2300, 'data': '30/01/2013', 'tupla1': ('Ferrari', 'MacLaren', 'Mercedes'),
              'lista1': ['Jan', 'Fev', 'Mar', 'Abr'], 'status': True, 'tupla2': ('Willians', 'Alpine',
                'Marlboro'), 'lista2': ['Mai', 'Jun', 'Jul', 'Ago', 'Set'], 'dicionario':
                  {'nome': 'Messi', 'idade': 36, 'escolaridade': 'Ensino Médio Completo.'}
              }
print(dicioMisto)

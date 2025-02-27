# Apresentar total de itens
listaMeses = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro']
print(listaMeses.__len__())

# Junte as duas listas em uma terceira lista vazia
primeiroSemestre = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho']
segundoSemestre = ['Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro']
anoCompleto = []
anoCompleto = primeiroSemestre + segundoSemestre
print(f"Ano Completo {anoCompleto}")

# Imprima de maneira separada o primeiro e o último item da lista
listaValores = [2200, 3400, 5750, 800, 2000, 1350]
print(f"Primeiro item: {listaValores[0]}")
print(f"Primeiro item: {listaValores[-1]}")

# Adicione o nome "Paula Fernandes" na posição 2
nomes = ['Suzy', 'Janaina', 'Claudevan', 'Maria Clara']
nomes[1] = 'Paula Fernandes'
print(nomes)

# Alter nome Sony para Sony Vaio/ Remova o nome Compaq da lista
nomesEmpresas = ['Dell', 'Apple', 'Sony', 'Acer', 'Compaq', 'Positivo', 'Lenovo']
nomesEmpresas[2] = 'Sony Vaio'
del nomesEmpresas[4]
print(nomesEmpresas)

# Imprima em ordem númerica crescente a lista exibida
listaNumerica = [230, 430, 100, 2, 670, 1212, 321, 89, 6, 34, 20, 9, 99, 710]
listaNumerica.sort(reverse=False)
print(listaNumerica)

# Agora imprima-a em ordem decrescente
listaNumerica.sort(reverse=True)
print(listaNumerica)

""" # Criar uma lista e solicitar 10 inseções de números
listaDez= []
for i in range(0, 10):
    listaDez.append(input('Digita 10 números a constarem nesta lista: '))

print(listaDez)"""

""" # Insira filmes, ao fim apresente-os e a quantidade deles.
listaFilmes = []
for i in range(0, 6):
    listaFilmes.append(input('Digita um filme por vez dentre seis filmes dos quais gostas: '))

print(listaFilmes, '\n', listaFilmes.__len__())
"""

#
listinhaNum = []
for i in range(0, 10):
    listinhaNum.append(input('Digita 10 números a calcular a média final: '))

result = sum(listinhaNum) / 2
print(result)

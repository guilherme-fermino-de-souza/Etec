lista01 = [1, 2, 3, 4, 5]
lista02 = [1, 'Texto', 3, 4.5, 5]

print(f'lista01 {lista01}')
print(f'lista02 {lista02}')
print(30* ' ')

lista02.append('Allan')
print(f'lista02 {lista02}')
print(30* ' ')

lista01.insert(0, 'numeros')
print(f'lista01 {lista01}')
print(30* ' ')

lista02[1] = 'Aline'
print(f'lista02 {lista02}')
print(30* ' ')

lista02.remove(4.5)
print(f'lista01 {lista01}')
print(30* ' ')

del lista02[3]  #Del via indice
print(f'lista02 {lista02}')
print(30* ' ')

listaPalavras = ['abril', 'bacamarte', 'céu', 'dossel', 'ermo']
print(f'Lista palavras: {listaPalavras}')

listaPalavras.pop() #Del último índice
print(f'Lista palavras.pop: {listaPalavras}')

listaPalavras.pop(-2) #Del registro via índice
print(f'Lista palavras.pop(i): {listaPalavras}')
print(30* ' ')

print('Índice da palavra bacamarte na lista: ', listaPalavras.index('bacamarte'))
print('festança' in listaPalavras)
print('dossel' in listaPalavras)
print(30* ' ')

listaConcatenada = lista02 + listaPalavras
print(listaConcatenada)
print(30* ' ')

listaRepetida = lista01 * 2
print(listaRepetida)
print(30* ' ')

listaNumerica = [3, 5, 7, 9, 2, 12]
print(sum(listaNumerica))
print(min(listaNumerica))
print(max(listaNumerica))
print(30* ' ')

print('Número de itens na lista 1: ', len(lista01))
print(30* ' ')

print('Primeiro item da lista 2: ', lista02[0])
print('Último item da lista 2: ', lista02[-1])
print(30* ' ')

listaNumerica.sort(reverse=False)
listaPalavras.sort(reverse=True)

print(listaPalavras)
print(30* ' ')
print(listaNumerica)

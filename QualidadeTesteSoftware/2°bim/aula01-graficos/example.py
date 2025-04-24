import matplotlib.pyplot as plt

# Dados para o gráfico
x = [1, 2, 2, 4]
y = [1, 4, 9, 16]

# Criação do gráfico
plt.plot(x, y)
plt.title("Meu Primeiro Gráfico com Matplotlib")
plt.xlabel("Eixo X")
plt.ylabel("Eixo Y")

# Exibe o gráfico
plt.show()

# Barras
categorias = ['A', 'B', 'C']  
valores = [3, 7, 2]  
plt.bar(categorias, valores)  
plt.title("Gráfico de Barras")  
plt.show()  

# Pizza
fatias = [35, 25, 40]  
atividades = ['Dormir', 'Trabalhar', 'Lazer']  
plt.pie(fatias, labels=atividades, autopct='%1.1f%%')  
plt.title("Gráfico de Pizza")  
plt.show()  

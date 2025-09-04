##importação de biblioteca

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

##para quebra de linha adicionar os
import os
##adicionar um tempo para carregar toda a página
import time


'''
Escolher 5 sites para extrair dados utilizando os conceitos em aula.
Anexar o código no bloco de notas.
'''

##driver que abre navegador
driver = webdriver.Chrome()

##link da url
'''driver.get('http://books.toscrape.com/')
driver.get('https://www.integralmedica.com.br/proteina/whey-protein?O=OrderByReleaseDateDESC')
driver.get('https://www.marabraz.com.br/moveis-quarto')
driver.get('https://www.joli.com.br/Pintura-e-acessorios/Tintas')
'''
driver.get('https://www.lolja.com.br/promocao-moletom/moletom-lolja')

##adicionar o tempo
time.sleep(5)

## inserir o XPATH criado ##
##escolher o elements porque são varios h3 ##
#criar variavel para receber valores ##
'''produtos = driver.find_elements(By.XPATH, "//article[@class='product_pod']/h3/a")
produtos = driver.find_elements(By.XPATH, "//div[@class='vtex-product-summary-2-x-nameContainer flex items-start justify-center pv6']/h2/span")
produtos = driver.find_elements(By.XPATH, "//div[@class='vtex-product-summary-2-x-nameContainer flex items-start justify-center pv6']/h3/span")
produtos = driver.find_elements(By.XPATH, "//div[@class='vtex-product-summary-2-x-nameContainer vtex-product-summary-2-x-nameContainer--container-name flex items-start justify-center pv6']/h3/span")
'''
produtos = driver.find_elements(By.XPATH, "//div[@class='description']/h2/a")

##produto nome dado no for e produtos vem das informaçoes armazenadas na variavel
##( Porque é apenas um elemento )
for produto in produtos:
  with open ('documento.csv','a',encoding="utf-8") as arquivo:


      arquivo.write(f'{produto.text}{os.linesep}')

##colocar um input  vazio para a pagina nao fechar
input (" ")

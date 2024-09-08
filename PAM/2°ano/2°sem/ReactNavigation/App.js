import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack'; // Correção na importação

/* Como o componente App.js é sempre renderizado
primeiro, devemos criar rotas nele para os outros 
componetes */

/* PROJETO: criar uma pasta "src" na raiz do projeto, nesta pasta criar outra chamada "pages",
que será onde armazenaremos nossas páginas.
Páginas:   Home
              index.js
              style.js
           Sobre
              index.js
              style.js*/


import Home from './src/Pages/Home';
import Sobre from './src/Pages/Sobre';

const Stack = createNativeStackNavigator ();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Home" component={Home}
          options={{ // Configuração do ccabeçalho
            title: "Tela Inicial",
            headerStyle:{backgroundColor: "#121212"},
            hearderTintColor:"#FFa500",
            //headerShow: false,
            /* Deve ser criada para cada página no arquivo
            que foi criado a rota */
          }}
        />
        <Stack.Screen name="Sobre" component={Sobre}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}

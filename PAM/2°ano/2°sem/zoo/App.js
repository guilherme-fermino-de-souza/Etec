import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

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
import Login from './src/Pages/Login';
import Territorios from './src/Pages/Territorios';
import Felinos from './src/Pages/Felinos';
import Canideos from './src/Pages/Canideos';
import Ursidae from './src/Pages/Ursidae';
import Hienideos from './src/Pages/Hienideos';
import Baleias from './src/Pages/Baleias';
import AvesdeRapina from './src/Pages/AvesdeRapina';

const Stack = createNativeStackNavigator ();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>

      <Stack.Screen name="Home" component={Home}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Login" component={Login}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Territorios" component={Territorios}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Felinos" component={Felinos}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Canideos" component={Canideos}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Ursidae" component={Ursidae}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Hienideos" component={Hienideos}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="Baleias" component={Baleias}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>
      <Stack.Screen name="AvesdeRapina" component={AvesdeRapina}
        options={{headerStyle:{backgroundColor:'#545454'},headerTintColor:'white'}}/>

      </Stack.Navigator>
    </NavigationContainer>
  );
}

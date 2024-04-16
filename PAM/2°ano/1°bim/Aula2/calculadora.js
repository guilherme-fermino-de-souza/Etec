import { StatusBar } from 'expo-status-bar';
import { useState } from "react";
import { StyleSheet, Text, View, TextInput, Picker} from 'react-native';
import { Button } from"react-native-web";

export default function App() {
  const [num1, setNum1] = useState();
  const [num2, setNum2] = useState();
  const [forma, setForma] = useState();
  const [resultado, setResultado] = useState(0);

  const Calcular = () => {
    if(forma=='soma'){
      setResultado(num1 + num2);
    } else if(forma=='subtracao'){
      setResultado(num1 - num2);
    } else if(forma=='multiplicacao'){
      setResultado(num1 * num2);
    } else if(forma=='divisao'){
      setResultado(num1 / num2);
    }
  };

  return (
    <View style={styles.container}>
      <StatusBar style='auto' />

        <View>
          <Text style={{
            color: 'white',
            fontSize: 40,
            marginBottom: 20,
            marginLeft: 45,
          }}>Calculadora</Text>

          <TextInput
             style={styles.campo}
             value={num1}
             placeholder="Digite o 1° Número"
             onChangeText={(value) => setNum1(value)}
            />
            <TextInput
             style={styles.campo}
             value={num2}
             placeholder="Digite o 2° Número"
             onChangeText={(value) => setNum2(value)}
            />
            <Picker
            style={styles.forma}
              selectedValue={forma}
              onValueChange={(itemValue, itemIndex) => setForma(itemValue)}
              >
                <Picker.Item label="Soma" value="soma" />
                <Picker.Item label="Subtração" value="subtracao" />
                <Picker.Item label="Multiplicação" value="multiplicacao" />
                <Picker.Item label="divisão" value="divisao" />
              </Picker>
        </View>

        <View style={styles.answer}>
         <Button
         style={styles.botao}
          title="Calcular"
          onPress={() => Calcular()} 
          />

          <View style={{
            color: 'white',
            fontSize: 30,
          }}>
            <Text>Resultado: {resultado}</Text>
          </View>


        </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#2A3640',
    color: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    borderColor: 'red',
    border: 100,
  },
  campo: {
    backgroundColor: '#025949',
    color: 'white',
    marginLeft: 25,
    width: 250,
    height: 50,
    borderRadius: 200,
    marginBottom: 40,
    textAlign: 'center',
  },
  forma: {
    width: '80%',
    borderRadius: 20,
    Color:'#025949',
    marginLeft: 35,
  },
  calcul: {
    backgroundColor: 'green',
    borderRadius: 20,
    fontSize: 300,
    color: 'white',
  },
  answer: {
    padding: 20,
    borderRadius: 20,
    fontSize: 300,
    color: 'white',
  },
  botao: {
    backgroundColor: '#55038C', // Cor de fundo do botão
    borderRadius: 20, // Borda arredondada
    padding: 10, // Espaçamento interno
    marginTop: 20, // Espaço superior
  },
  resultado: {
    fontSize: 3,
    backgroundColor: 'yellow',
    color: 'white',
    fontSize: 40,
  },
});

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
          <Text>Numeradores</Text>

          <TextInput
             style={styles.campo}
             value={num1}
             placeholder="Digite o 1° Número"
             onChangeText={(value) => setNum1(value)}
            />
            <TextInput
             style={StyleSheet.campo}
             value={num2}
             placeholder="Digite o 2° Número"
             onChangeText={(value) => setNum2(value)}
            />
            <Picker
              selectedValue={forma}
              onValueChange={(itemValue, itemIndex) => setForma(itemValue)}
              >
                <Picker.Item label="Soma" value="soma" />
                <Picker.Item label="Subtração" value="subtracao" />
                <Picker.Item label="Multiplicação" value="multiplicacao" />
                <Picker.Item label="divisão" value="divisao" />
              </Picker>
        </View>

        <View>
         <Button
          title="Calcular"
          onPress={() => Calcular()} 
          />

          <View>
            <Text>Resultado: {resultado}</Text>
          </View>


        </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    color: 'black',
    alignItems: 'center',
    justifyContent: 'center',
  },
  campo: {
    backgroundColor: '#fff',
    color: 'black',
    width: 300,
    height: 50,
  }
})

import { StatusBar } from 'expo-status-bar';
import { useState } from "react";
import { StyleSheet, Text, View } from 'react-native';
import { Button, TextInput } from"react-native-web";

export default function App() {
  const [nome, setNome] = useState();
  const [ exibir, setExibir] = useState("oi");

  const ExibirNome = () => {
    setExibir([nome]);
  };

  return (
    <View style={styles.container}>
      <Text>Digite um Texto: </Text>
      <TextInput
       placeholder={"Digite um Nome"}
       style={{ borderWidht: 1, height: 40, widht: "100%"}}
       onChangeText={(text) => setNome(text)}
    />
    <Button title="Exibe o Texto" onPress={() => ExibirNome()} />

    <Text>exibir</Text>
    </View>
  );
}


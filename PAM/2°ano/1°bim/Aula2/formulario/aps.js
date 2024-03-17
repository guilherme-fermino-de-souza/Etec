import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import { StyleSheet, Text, View, Image, TextInput } from 'react-native'; // Importar TextInput
import { Button, Picker, ScrollView, Switch, TouchableOpacity } from 'react-native'; // Alterar para 'react-native' ao invés de 'react-native-web'

export default function App() {
  const [name, setName] = useState('');
  const [phone, setPhone] = useState('');
  const [address, setAddress] = useState('');
  const [email, setEmail] = useState('');

  const salvar = () => {
    // Lógica para salvar
    console.log("Salvar");
  }

  return (
    <View style={styles.container}>
      <Image
        style={{
          width: 40,
          height: 40,
          borderRadius: 20,
        }}
        source={{
          uri: 'https://placehold.it/150x150'
        }}
      />
      <Text>Usuário</Text>

      <Text>Formulário</Text>
      <StatusBar style="auto" />
      <TextInput
        style={styles.input}
        onChangeText={setName}
        value={name}
        placeholder="Digite Seu Nome"
      />
      <TextInput
        style={styles.input}
        onChangeText={setPhone}
        value={phone}
        placeholder="Digite Seu Telefone"
        keyboardType="numeric"
      />
      <TextInput
        style={styles.input}
        onChangeText={setAddress}
        value={address}
        placeholder="Digite Seu Endereço"
      />
      <TextInput
        style={styles.input}
        onChangeText={setEmail}
        value={email}
        placeholder="Digite Seu E-mail"
        keyboardType="email-address"
      />
      <Button
        title="Press me"
        color="red"
        onPress={salvar}
      />     
    </View>

  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
  },
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    margin: 10,
    padding: 10,
  },
});

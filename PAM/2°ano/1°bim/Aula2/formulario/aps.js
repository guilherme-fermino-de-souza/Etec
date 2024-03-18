import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import { StyleSheet, Text, View, Image, TextInput } from 'react-native'; // Importar TextInput
import { Button, Picker, ScrollView, Switch, TouchableOpacity } from 'react-native'; // Alterar para 'react-native' ao invés de 'react-native-web'

//valores adcionados pelo usuário
export default function App() { 
  const [name, setName] = useState('');
  const [phone, setPhone] = useState('');
  const [address, setAddress] = useState('');
  const [email, setEmail] = useState('');
  const [selectedValue, setSelectedValue] = useState('java'); //estado para o picker
  const [termsAccepted, setTermsAccepted] = useState(false); //estado para o switch
  const [userData, setUserData] = useState({
    name: '',
    phone: '',
    address: '',
    email: '',
  });

  const salvar = () => {
    // Lógica para salvar
    console.log("Salvar");
    if (termsAccepted) {
      console.log("Termos aceitos");// caso aceito
      // Atualiza o estado com os dados inseridos
      setUserData({
      name: name,
      phone: phone,
      address: address,
      email: email,
    });
    } else {
      console.log("Você precisa aceitar os termos de serviço");
      // caso recusado
    }
  }

  const toggleSwitch = () => {
    setTermsAccepted(previousState => !previousState);
  };

  return ( 
    // container principal
    <View style={styles.container}>
     <ScrollView>   {/* habilita o scroll */}
    {/* container foto/nome user */}
      <View style={styles.header}>
      <Image
        style={{
          width: 40,
          height: 40,
          borderRadius: 20,
        }}
        source={{
          uri: 'https://placehold.it/170x170'
        }}
      />
      <Text style={styles.title}>Nome Usuário</Text>
      </View>

    {/* container formulário */}
    <View style={styles.formContainer}>
      <Text style={styles.formTitle}>Formulário</Text>
      <StatusBar style="auto" />
      <TextInput
        style={styles.input}
        onChangeText={setName}
        value={name}
        placeholder="Digite Seu Nome"
        maxLength={30} //max de caracteres
      />
      <TextInput
        style={styles.input}
        onChangeText={setPhone}
        value={phone}
        placeholder="Digite Seu Telefone"
        keyboardType="numeric"
        maxLength={9} //max de caracteres
      />
      <TextInput
        style={styles.input}
        onChangeText={setAddress}
        value={address}
        placeholder="Digite Seu Endereço"
        maxLength={25} //max de caracteres
      />
      <TextInput
        style={styles.input}
        onChangeText={setEmail}
        value={email}
        placeholder="Digite Seu E-mail"
        keyboardType="email-address"
        maxLength={25} //max de caracteres
      />
      {/* botão(confirmar ação e salvar) */}
      <Button
        title="Log In"
        color="rgb(65, 212, 225)"
        onPress={salvar}
        style={{
          width: 100,
          height: 40,
          borderRadius: 20,          
        }}
      />     
    </View>

    {/* escolha de opção */}
    <View style={styles.infoContainer}>
      <Picker
        selectedValue={selectedValue}
        style={{ 
        height: 40, 
        width: 300,
        }}
        onValueChange={
          (itemValue, itemIndex) => 
          setSelectedValue(itemValue)}
          >
            <Picker.Item label="Java" value="java" />
            <Picker.Item label="JavaScript" value="js" />
          </Picker>

        <TouchableOpacity onPress={toggleSwitch} style={styles.chooseTerms}>
          <Text>Termos de Serviço:</Text>
          <Switch
           trackColor={{
            false: "#767577",
            true: "#81b0ff"
           }}
           thumbColor={termsAccepted ? "#f5dd4b" : "#f4f3f4"}
           ios_backgroundColor="#3e3e3e"
           onValueChange={toggleSwitch}
           value={termsAccepted}>
           </Switch>
           </TouchableOpacity>
    </View>
    <View style={styles.answerContainer}>
      <Text style={styles.tableTitle}>Dados Inseridos:</Text>
      <View style={styles.answerColuna}>

        <View style={styles.answerLinha}>
        <Text style={styles.answerCell}>Nome:</Text>
        <Text style={styles.answerCell}>{userData.name}</Text>
        </View>
        <View style={styles.answerLinha}>
        <Text style={styles.answerCell}>Telefone:</Text>
        <Text style={styles.answerCell}>{userData.phone}</Text>
        </View>

        <View style={styles.answerLinha}>
        <Text style={styles.answerCell}>Endereço:</Text>
        <Text style={styles.answerCell}>{userData.address}</Text>
        </View>

        <View style={styles.answerLinha}>
        <Text style={styles.answerCell}>E-mail:</Text>
        <Text style={styles.answerCell}>{userData.email}</Text>
        </View>
      </View>
    </View>
    </ScrollView>
</View>
  );
}


const styles = StyleSheet.create({ //cria uma área para estilização css

input: {
  height: 40,
  borderColor: 'gray',
  borderWidth: 1,
  margin: 10,
  padding: 10,
  maxWidth: 300, //largura máxima para campo de entrada
},

  container: { //container principal
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    borderWidth: 1,
    borderColor: 'black',
  },

  header: { //foto/nome user
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 2,
    borderWidth: 1,
    borderColor: 'black',
    backgroundColor: '#3e3e3e'
  },

  title: { //nome user
    fontSize: 24,
    marginLeft: 10,
    Color: 'white',
  },

  formContainer: { //formulário
    borderWidth: 1,
    borderColor: 'black',
    padding: 10,
    marginBottom: 20,
  },

  formTitle: { //título do formulário
    fontSize: 18,
    marginBottom: 10,
  },

  input: { //opções do formulário
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    margin: 10,
    padding: 10,
  },

  infoContainer: { //informações extras
    borderWidth: 1,
    borderColor: 'black',
    padding: 10,
    marginBottom: 20,
  },

  answerContainer: { //respostas
    borderWidth: 1,
    borderColor: 'black',
    padding: 10,
    marginBottom: 20,
  },

  tableTitle: { //título das respostas
    fontSize: 18,
    marginBottom: 10,
  },

  answerColuna: { //coluna de resposta da resposta
    flexDirection: 'column',
    marginBottom: 5,
  },

  answerLinha: {
    display: 'flex',
    flexDirection: 'row'
  },

  answerCell: { //resposta colocada
    fontWeight: 'bold',
    marginRight: 10,
  },
});

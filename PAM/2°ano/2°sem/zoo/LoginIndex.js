import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import { StyleSheet, Text, View, Image, TextInput, TouchableOpacity, ScrollView } from 'react-native';

export default function App() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [termsAccepted, setTermsAccepted] = useState(false);
  const [userData, setUserData] = useState({ name: '', email: '' });

  const salvar = () => {
    console.log("Salvar");
    if (termsAccepted) {
      console.log("Termos aceitos");
      setUserData({ name, email });
    } else {
      console.log("Você precisa aceitar os termos de serviço");
    }
  };

  const toggleSwitch = () => {
    setTermsAccepted(previousState => !previousState);
  };

  return (
    <View style={styles.container}>
      <ScrollView>
        <View style={styles.header}>
          <View style={styles.headerTwo}>
            <Image
              style={styles.profileImage}
              source={{
                uri: 'https://l-mobimobile.nl/wp-content/uploads/2021/10/user-lmobi-v5.png'
              }}
            />
            <Text style={styles.title}>Login</Text>
          </View>
        </View>

        <View style={styles.formContainer}>
          <Text style={styles.formTitle}>Entre Na Sua Conta</Text>
          <StatusBar style="auto" />
          <TextInput
            style={styles.input}
            onChangeText={setName}
            value={name}
            placeholder="Nome"
            maxLength={30}
          />
          <TextInput
            style={styles.input}
            onChangeText={setEmail}
            value={email}
            placeholder="E-mail"
            keyboardType="email-address"
            maxLength={25}
          />
          <TouchableOpacity
            style={styles.button}
            onPress={salvar}
          >
            <Text style={styles.buttonText}>Login</Text>
          </TouchableOpacity>
        </View>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 16,
    backgroundColor: '#e8f0fe',
  },
  header: {
    alignItems: 'center',
    marginBottom: 20,
  },
  headerTwo: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  profileImage: {
    width: 60,
    height: 60,
    borderRadius: 30,
    marginRight: 10,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  formContainer: {
    marginTop: 20,
  },
  formTitle: {
    fontSize: 16,
    marginBottom: 10,
  },
  input: {
    height: 40,
    borderColor: '#ccc',
    borderWidth: 1,
    marginBottom: 12,
    paddingHorizontal: 10,
    borderRadius: 5,
  },
  button: {
    backgroundColor: '#0C0C0D',
    paddingVertical: 10,
    borderRadius: 20,
    alignItems: 'center',
  },
  buttonText: {
    color: '#e8f0fe',
    fontSize: 18,
  },
});

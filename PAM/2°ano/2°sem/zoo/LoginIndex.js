import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import { StyleSheet, Text, View, Image, TextInput } from 'react-native';
import { Button, Picker, ScrollView, Switch, TouchableOpacity } from 'react-native';
import { CheckBox } from 'react-native-web';

export default function App() {
  const [name, setName] = useState('');
  const [phone, setPhone] = useState('');
  const [address, setAddress] = useState('');
  const [email, setEmail] = useState('');
  const [selectedValue, setSelectedValue] = useState('java');
  const [termsAccepted, setTermsAccepted] = useState(false);
  const [userData, setUserData] = useState({
    name: '',
    phone: '',
    address: '',
    email: '',
  });

  const salvar = () => {
    console.log("Salvar");
    if (termsAccepted) {
      console.log("Termos aceitos");
      setUserData({
        name: name,
        phone: phone,
        address: address,
        email: email,
      });
    } else {
      console.log("Você precisa aceitar os termos de serviço");
    }
  }

  const toggleSwitch = () => {
    setTermsAccepted(previousState => !previousState);
  };

  return (
    <View style={styles.container}>
      <ScrollView>
        <View style={styles.header}>
          <View style={styles.headerTwo}>
            <Image
              style={{
                width: 60,
                height: 60,
                borderRadius: 20,
              }}
              source={{
                uri: 'https://l-mobimobile.nl/wp-content/uploads/2021/10/user-lmobi-v5.png'
              }}
            />
            <Text style={styles.title}>User Name</Text>
          </View>
        </View>

        <View style={styles.formContainer}>
          <Text style={styles.formTitle}>Form</Text>
          <StatusBar style="auto" />
          <TextInput
            style={styles.input}
            onChangeText={setName}
            value={name}
            placeholder="Name"
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
          <Button
            title="Log In"
            color="rgb(65, 212, 225)"
            onPress={salvar}
            style={{
              width: 8,
              height: 400,
              borderRadius: 20,
            }}
          />
        </View>
      </ScrollView>
    </View>
  );
}

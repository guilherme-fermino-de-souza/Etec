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
            onChangeText={setPhone}
            value={phone}
            placeholder="Phone"
            keyboardType="numeric"
            maxLength={9}
          />
          <TextInput
            style={styles.input}
            onChangeText={setAddress}
            value={address}
            placeholder="Address"
            maxLength={25}
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

        <View style={styles.infoContainer}>
          <Picker
            selectedValue={selectedValue}
            style={{
              height: 40,
              width: 300,
            }}
            onValueChange={(itemValue, itemIndex) =>
              setSelectedValue(itemValue)}
          >
            <Picker.Item label="Java" value="java" />
            <Picker.Item label="JavaScript" value="js" />
          </Picker>

          <TouchableOpacity onPress={toggleSwitch} style={styles.chooseTerms}>
            <Text>Service Terms:</Text>
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
          <Text style={styles.tableTitle}>log In:</Text>
          <View style={styles.answerColuna}>

            <View style={styles.answerLinha}>
              <Text style={styles.answerCell}>Name:</Text>
              <Text style={styles.answerCell}>{userData.name}</Text>
            </View>
            <View style={styles.answerLinha}>
              <Text style={styles.answerCell}>Phone:</Text>
              <Text style={styles.answerCell}>{userData.phone}</Text>
            </View>

            <View style={styles.answerLinha}>
              <Text style={styles.answerCell}>Address:</Text>
              <Text style={styles.answerCell}>{userData.address}</Text>
            </View>

            <View style={styles.answerLinha}>
              <Text style={styles.answerCell}>E-mail:</Text>
              <Text style={styles.answerCell}>{userData.email}</Text>
            </View>
            <View style={styles.answerLinha}>
              <Text style={styles.answerCell}>Accepted: {termsAccepted ? "Yes" : "No"}</Text>
            </View> 
          </View>
        </View>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    margin: 10,
    padding: 10,
    maxWidth: 300,
  },

  container: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    borderWidth: 1,
    borderColor: 'black',
  },

  header: {
    alignItems: 'center',
    borderWidth: 1,
    borderColor: 'black',
    borderTopWidth: 5,
    borderBottomWidth: 5,
    backgroundColor: '#3e3e3e'
  },

  headerTwo: {
    flexDirection: 'row',
    margin: 25,
  },

  title: {
    fontSize: 28,
    marginLeft: 10,
    marginTop: 7,
    color: 'white',
  },

  formContainer: {
    borderWidth: 1,
    borderColor: 'black',
    borderTopWidth: 5,
    borderBottomWidth: 5,
    padding: 10,
  },

  formTitle: {
    fontSize: 18,
    marginBottom: 10,
  },

  infoContainer: {
    borderWidth: 1,
    borderColor: 'black',
    borderTopWidth: 5,
    borderBottomWidth: 5,
    padding: 10,
  },

  answerContainer: {
    borderWidth: 1,
    borderColor: 'black',
    borderTopWidth: 5,
    borderBottomWidth: 5,
    padding: 10,
    marginBottom: 20,
  },

  tableTitle: {
    fontSize: 18,
    marginBottom: 10,
  },

  answerColuna: {
    flexDirection: 'column',
    marginBottom: 5,
  },

  answerLinha: {
    display: 'flex',
    flexDirection: 'row',
  },

  answerCell: {
    fontWeight: 'bold',
    marginRight: 10,
  },
});
